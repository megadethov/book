package ua.mega.hibernate.aop;

public interface Task<T> {

    void execute();

    T getResult();
}
