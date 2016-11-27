package se.lecture_06_Generics;

// класс - типа кнтейнер
public class MyWrongBox {

    private Object field; // в это поле можем положить, что угодно

    public MyWrongBox(Object field) {
        this.field = field;
    }

    public void getTypeInfo() {
        System.out.println("The field type is - " + field.getClass().getCanonicalName());
    }

    public Object getField() {
        return field;
    }

    @Override
    public String toString() {
        return "MyWrongBox{" +
                "field=" + field +
                '}';
    }
}

class Main {
    public static void main(String[] args) {

        // Создадим 2 бокса, в один положим String, в другой - int(Integer)
        MyWrongBox box1 = new MyWrongBox("first item");
        MyWrongBox box2 = new MyWrongBox(100);

        // извлекаем из Object объекты и кастим к нужному типу
        String field1 = (String) box1.getField(); // нет ошибки компиляции
        Integer field2 = (Integer) box2.getField(); // нет ошибки компиляции
//        Integer field3 = (Integer) box1.getField(); // нет ошибки компиляции, но возникает ошибка выполнения java.lang.ClassCastException
        Object field4 = box1.getField(); // нет ошибки компиляции (кастиь не нужно)

        box1.getTypeInfo();
        box2.getTypeInfo();
//        field4.getTypeInfo(); // ошибка компиляции, в классе Object нет метода getTypeInfo()

        System.out.println(box1);
        System.out.println(box2);
    }
}
