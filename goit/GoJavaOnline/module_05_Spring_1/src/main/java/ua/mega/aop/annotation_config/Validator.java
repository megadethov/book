package ua.mega.aop.annotation_config;

public interface Validator<T> {

    boolean isValid(T result);
}
