package ua.mega.java_config;

public interface Task<T> {

    void execute();

    T getResult();
}
