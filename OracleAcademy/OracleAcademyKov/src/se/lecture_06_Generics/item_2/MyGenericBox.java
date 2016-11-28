package se.lecture_06_Generics.item_2;

public class MyGenericBox <T> {
    private T field;

    public MyGenericBox(T field) {
        this.field = field;
    }
    public void getTypeInfo() {
        System.out.println("The field type is " + field.getClass().getName());
    }

    public T getField() {
        return field;
    }

    @Override
    public String toString() {
        return "MyGenericBox{" +
                "field=" + field +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        MyGenericBox<String> box1 = new MyGenericBox<String>("first item");
        MyGenericBox<Integer> box2 = new MyGenericBox<Integer>(100);
//        MyGenericBox<Number> box3 = new MyGenericBox<Integer>(100); // ошибка компиляции

        String field1 = box1.getField(); // отпала необходимость в явном кастовании
        Integer field2 = box2.getField(); // отпала необходимость в явном кастовании
//        Integer field3 = box1.getField(); // теперь компилятор контролирует несоответствие типов, благодаря Generics

        box1.getTypeInfo();
        box2.getTypeInfo();

        System.out.println(box1);
        System.out.println(box2);
    }
}
