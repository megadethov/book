package _08_Methods_Handling;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Camera> cameras = new ArrayList<>();
//        find(cameras, new Camera()); //  List<Camera> не катит
        // Метод find() принимает List<Product>
        // Для того, чтобы можно было юзать метод не только для List<Product> - нужен - ?
    }

    public static boolean find(List<Product> all, Product product) {
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