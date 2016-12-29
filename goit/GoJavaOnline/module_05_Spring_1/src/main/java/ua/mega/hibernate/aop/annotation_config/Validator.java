package ua.mega.hibernate.aop.annotation_config;

public interface Validator<T> {

    boolean isValid(T result);
}
