package ua.mega.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts = new ArrayList<>();

    public boolean add(String part) {
        return  parts.add(part);
    }

    public void show() {
        for (String s : parts) {
            System.out.println(s);
        }
    }
}
