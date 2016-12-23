package ua.mega.aop.xml_config;

public interface Validator<T> {

    boolean isValid(T result);
}
