import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SerialExecutorTest {

    @org.testng.annotations.Test
    public void testExecuteWithoutValidator() throws Exception {
        SerialExecutor<Integer> executor = new SerialExecutor<Integer>();
        executor.addTask(new AddTask(1, 2));
        executor.execute();
        assertEquals(executor.getValidResults().size(), 1, "Wrong valid results size");
        assertEquals(executor.getInvalidResults().size(), 0, "Wrong invalid results size");
        assertEquals(executor.getValidResults().get(0), Integer.valueOf(3), "Wrong execution result");
    }

    @Test
    public void testExecuteWithValidator() throws Exception {
        SerialExecutor<Integer> executor = new SerialExecutor<>();
        executor.addTask(new AddTask(1, -2), result -> result >= 0);
        executor.execute();
        assertEquals(executor.getValidResults().size(), 0, "Wrong valid results size");
        assertEquals(executor.getInvalidResults().size(), 1, "Wrong invalid results size");
        assertEquals(executor.getInvalidResults().get(0), Integer.valueOf(-1), "Wrong execution result");
    }

    // по хорошему на Task нужно писать отдельный тест, но он очень простой и мы его лепим в этом тесте
    private static class AddTask implements Task<Integer> {

        private int value1;
        private int value2;
        private int result;

        public AddTask(int value1, int value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        @Override
        public void execute() {
            result = value1 + value2;
        }

        @Override
        public Integer getResult() {
            return result;
        }
    }

}