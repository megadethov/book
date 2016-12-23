package ua.mega.java_config;

public interface Validator<T> {

    boolean isValid(T result);
}
