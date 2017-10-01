package se.lecture_03_Exception_junit.item_4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        try {
            parent.test();
        } catch (Throwable th) {
            // Здесь перехватывается RuntimeException из test(), его причина - IOException
            System.out.println(th); // java.lang.RuntimeException: java.io.IOException
            System.out.println(th.getCause()); // java.io.IOException
        }
    }
}

class Parent {
    public void test() {
        System.out.println("some parent work");
    }
}

class Child extends Parent {
    @Override
    public void test() {
        System.out.println("some child work");
        try {
            IOException ioException = new IOException();
            throw ioException;
        } catch (IOException e) {
            throw new RuntimeException(e); // бросаем новое исключение и в кач-ве аоргумента в конструкторе - предыдущее

        }
    }
}
