package ua.mega.aop;

public interface Validator<T> {

    boolean isValid(T result);
}
