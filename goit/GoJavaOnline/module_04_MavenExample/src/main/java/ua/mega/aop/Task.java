package ua.mega.aop;

public interface Task<T> {

    void execute();

    T getResult();
}
