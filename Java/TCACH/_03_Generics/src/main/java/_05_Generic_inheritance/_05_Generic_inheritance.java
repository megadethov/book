package _05_Generic_inheritance;

public class _05_Generic_inheritance {
    public static void main(String[] args) {

        // В такой контейнер можно пихать любой App.Product
        Container<Product> c1 = new Container(); // Мы можем создать контейнер для любого типа. Например - App.Container<String>
        c1.setItem(new Product());
        c1.setItem(new Camera());
        c1.setItem(new Phone());

        c1.getItem();

        // Если же мы хотим, чтобы в контейнере хранились только App.Product и наследники (String контейнер нельзя создать) - нужен BOUNDED
        // Создадим другой контейнер только для App.Product и его наследников
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


class Container<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

