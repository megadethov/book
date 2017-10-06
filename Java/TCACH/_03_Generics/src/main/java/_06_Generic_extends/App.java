package _06_Generic_extends;

public class App {
    public static void main(String[] args) {

        // Такой контейнер можно создать только для Product и его наследников
//        Container<String> c0 = new Container<String>(); // compile error
        Container<Product> c1 = new Container<>(); // ok
        Container<Phone> c2 = new Container<>(); // ok
        Container<Camera> c3 = new Container<>(); // ok
        c1.setItem(new Product());
        c1.setItem(new Camera());
        c1.setItem(new Phone());

        c1.getItem();
    }
}

class Product {
    private String name;
    private int price;
}

class Camera extends Product {
    private int pixel;
}

class Phone extends Product {
    private String model;
}

// Создадим другой контейнер только для Product и его наследников
class Container<T extends Product> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

