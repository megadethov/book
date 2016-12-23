package ua.mega.aop.java_config;

public interface Validator<T> {

    boolean isValid(T result);
}
