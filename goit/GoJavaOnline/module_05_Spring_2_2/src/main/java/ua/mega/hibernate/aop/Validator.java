package ua.mega.hibernate.aop;

public interface Validator<T> {

    boolean isValid(T result);
}
