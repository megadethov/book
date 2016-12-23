package ua.mega.xml_config;

public interface Task<T> {

    void execute();

    T getResult();
}
