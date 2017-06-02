package ua.mega.hibernate.aop.xml_config;

public interface Validator<T> {

    boolean isValid(T result);
}
