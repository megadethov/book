package ua.mega.aop.annotation_config;

public interface Task<T> {

    void execute();

    T getResult();
}
