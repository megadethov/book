package ua.mega.hibernate.aop.java_config;

public interface Validator<T> {

    boolean isValid(T result);
}
