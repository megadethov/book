package se.lecture_06_Generics.item_3;

public class MyMultiGenericBox<A, B> {
    private A field1;
    private B field2;

    public MyMultiGenericBox(A field1, B field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public A getField1() {
        return field1;
    }

    public B getField2() {
        return field2;
    }

    @Override
    public String toString() {
        return "MyMultiGenericBox{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                '}';
    }
}

class Main {
    public static void main(String[] args) {

        // для пары String, Integer (можем указать любую пару типов)
        MyMultiGenericBox<String, Integer> box = new MyMultiGenericBox<>("ferst arg", 100);
        String field1 = box.getField1();
        Integer field2 = box.getField2();

        System.out.println(field1 + ", " + field2);
    }
}
