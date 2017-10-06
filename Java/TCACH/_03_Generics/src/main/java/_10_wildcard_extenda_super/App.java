package _10_wildcard_extenda_super;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

/*        List<Integer> src = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> dest = new ArrayList<>();
        copy(src, dest);
        System.out.println(dest);*/

        List<Camera> src = new ArrayList<>();
        src.add(new Camera());
        src.add(new Camera());
        src.add(new Camera());
//        List<Phone> dest = new ArrayList<>(); // не катит
//        List<Camera> dest = new ArrayList<>(); // не катит
        List<Product> dest = new ArrayList<>(); // OK


        copyAll(src, dest);
        System.out.println(dest);
    }

    // Обобщенный метод копирования из одного List<Integer> в другой.
    public static void copy(List<Integer> srs, List<Integer> dest) {
        for (Integer next : srs) {
            dest.add(next);
        }
    }

    // Обобщенный метод копирования для любых типов
    // Чтобы не было смешения братьев и сестер в dest, он может иметь тип только общий для всех, те выше Product
    public static void copyAll(List<? extends Product> srs, List<? super Product> dest) {
        for (Product next : srs) {
            dest.add(next);
        }
    }
}

class Product {
    @Override
    public String toString() {
        return "Product{}";
    }
}

class Camera extends Product {
    @Override
    public String toString() {
        return "Camera{}";
    }
}

class Phone extends Product {
    @Override
    public String toString() {
        return "Phone{}";
    }
}


