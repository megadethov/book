package ua.mega;

public interface Task<T> {

    void execute();

    T getResult();
}
