package _09_Methods_Handling_wildcard;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Camera> cameras = new ArrayList<>();
        find(cameras, new Camera()); // теперь все ок
        // Но имеется лажа - можем здесь пихнуть список камер с продуктом
        find(cameras, new Product()); // нужен другой способ - find2()

        // Здесь лажа не пройдет
//        find2(cameras, new Product()); // compile error
        find2(cameras, new Camera()); // Для одного типа все ок
    }

    // Для того, чтобы можно было юзать метод не только для List<Product>, а и List<Camera> - нужен - ?
//    public static boolean find(List<Product> all, Product product) {
    public static boolean find(List<? extends Product> all, Product product) {
        for (Product next : all) {
            if (true) return true;
        }
        return false;
    }

    // Здесь уже и List и искомое - одного типа
    public static <T extends Product> boolean find2(List<T> all, T product) {
        for (Product next : all) {
            if (true) return true;
        }
        return false;
    }
}

class Product {

}

class Camera extends Product {

}