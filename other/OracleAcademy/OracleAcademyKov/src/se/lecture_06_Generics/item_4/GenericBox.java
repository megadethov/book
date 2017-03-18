package se.lecture_06_Generics.item_4;

public class GenericBox<T> {
    // тип объявляем 1 раз, а используем сколько угодно в коде
    private T field1;
    private T field2;

    public GenericBox(T field1, T field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public T getField1() {
        return field1;
    }

    public T getField2() {
        return field2;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
//        GenericBox<String> box1 = new GenericBox<String>("value", 100); // ошибка компиляции
        GenericBox<String> box2 = new GenericBox<>("value1", "value2");
        GenericBox<Integer> box3 = new GenericBox<>(100, 200);

        String field1 = box2.getField1();

        System.out.println(box2.getField1());
        System.out.println(box2.getField2());
    }
}
