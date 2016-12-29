package ua.mega.hibernate.aop.java_config;

public interface Task<T> {

    void execute();

    T getResult();
}
