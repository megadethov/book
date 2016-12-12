import java.util.ArrayList;
import java.util.List;

public class SerialExecutor<T> implements Executor<T> {

    private List<Task<? extends T>> tasks = new ArrayList<>();
    private List<T> validResults = new ArrayList<>();


    @Override
    public void addTask(Task<? extends T> task) {
        tasks.add(task);
    }

    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) {

    }

    @Override
    public void execute() {
        for (Task<? extends T> task : tasks) {
            task.execute();
            validResults.add(task.getResult());
        }
    }

    @Override
    public List<T> getValidResults() {
        return validResults;
    }

    @Override
    public List<T> getInvalidResults() {
        return null;
    }
}
