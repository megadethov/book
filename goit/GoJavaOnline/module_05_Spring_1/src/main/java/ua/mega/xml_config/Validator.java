package ua.mega.xml_config;

public interface Validator<T> {

    boolean isValid(T result);
}
