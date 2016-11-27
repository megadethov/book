package se.lecture_03_Exception_junit.item_3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
    public void test() throws IOException {
        System.out.println("some parent work");
    }
}

class Child extends Parent {

    @Override
    // могу ничего не бросать, могу расширить родителя(потомки), могу - любой unchecked.
    public void test() throws FileNotFoundException, Error, RuntimeException { // Exception - нельзя предков родителя
        System.out.println("some child work");
    }

    public static void main(String[] args) throws IOException {
        Parent parent = new Child();
        parent.test();
    }
}