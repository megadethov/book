package ua.mega.annotation_config;

public interface Task<T> {

    void execute();

    T getResult();
}
