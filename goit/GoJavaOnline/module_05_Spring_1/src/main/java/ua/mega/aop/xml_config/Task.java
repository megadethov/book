package ua.mega.aop.xml_config;

public interface Task<T> {

    void execute();

    T getResult();
}
