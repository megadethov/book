package se.lecture_06_Generics.item_2;

public class $Main {
    public static void main(String[] args) {
        MyBox<String> box = new MyBox<>("HELLO");
        String cell = box.getCell();
    }
}

class MyBox<T> {
    private T cell;

    public MyBox(T cell) {
        this.cell = cell;
    }

    public T getCell() {
        return cell;
    }
}

