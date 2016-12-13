import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SerialExecutor<T> implements Executor<T> {

    // эта лямбда заменяет имплементацию метода интерфкйса Validator - метда isValid(), к-ый всегда возвращает - true
    // избавляет от необходимости создавать класс, имплементирующий Validator
    private static final Validator<Object> DEFAULT_VALIDATOR = value -> true; // перередаем в лямбду - value, возвращаем - true

    private List<TaskAndValidator<T>> tasks = new ArrayList<>();
    private List<T> validResults = new ArrayList<>();
    private List<T> invalidResults = new ArrayList<T>();

    private Map<Task<? extends T>, Validator<? super T>> map = new HashMap<>();


    @Override
    public void addTask(Task<? extends T> task) {
        addTask(task, DEFAULT_VALIDATOR);
    }

    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) {
        tasks.add(new TaskAndValidator<T>(task, validator));
        map.put(task, validator);
    }

    @Override
    public void execute() {
        for (TaskAndValidator<T> tTaskAndValidator : tasks) {
            Task<? extends T> task = tTaskAndValidator.task;
            task.execute();
            if (tTaskAndValidator.validator.isValid(task.getResult())) {
                validResults.add(task.getResult());
            } else {
                invalidResults.add(task.getResult());
            }
        }
    }

    @Override
    public List<T> getValidResults() {
        return validResults;
    }

    @Override
    public List<T> getInvalidResults() {
        return invalidResults;
    }

    private static class TaskAndValidator<T> {

        public TaskAndValidator(Task<? extends T> task, Validator<? super T> validator) {
            this.task = task;
            this.validator = validator;
        }

        private Task<? extends T> task;
        private Validator<? super T> validator;
    }
}
