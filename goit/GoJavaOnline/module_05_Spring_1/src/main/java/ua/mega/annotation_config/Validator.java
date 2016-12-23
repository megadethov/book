package ua.mega.annotation_config;

public interface Validator<T> {

    boolean isValid(T result);
}
