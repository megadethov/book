package ua.mega;

public interface Validator<T> {

    boolean isValid(T result);
}
