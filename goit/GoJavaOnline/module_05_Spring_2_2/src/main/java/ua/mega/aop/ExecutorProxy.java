package ua.mega.aop;

import java.util.List;

/**
 * Created by mega on 23.12.2016.
 */
public class ExecutorProxy<T> implements Executor<T> {

    Executor<T> executor;

    public void setExecutor(Executor<T> executor) {
        this.executor = executor;
    }

    @Override
    public void addTask(Task<? extends T> task) {
        executor.addTask(task);
    }

    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) {
        executor.addTask(task, validator);
    }

    @Override
    public void execute() {
        System.out.println("ExecutorProxy before execute ...");
        executor.execute();
        System.out.println("ExecutorProxy after execute ...");
    }

    @Override
    public List<T> getValidResults() {
        return executor.getValidResults();
    }

    @Override
    public List<T> getInvalidResults() {
        return executor.getInvalidResults();
    }
}
