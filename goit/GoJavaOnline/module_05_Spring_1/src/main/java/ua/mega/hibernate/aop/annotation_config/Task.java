package ua.mega.hibernate.aop.annotation_config;

public interface Task<T> {

    void execute();

    T getResult();
}
