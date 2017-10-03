package se.lecture_06_Generics.item_1;

public class $Main {
    public static void main(String[] args) {
        MyBox box1 = new MyBox("HELLO");
        MyBox box2 = new MyBox(1000);

        String str = (String) box1.getCell();
        Integer i = (Integer) box2.getCell();

        System.out.println(str + " " + i);

    }
}

class MyBox {
   private Object cell;

    public MyBox(Object cell) {
        this.cell = cell;
    }

    public Object getCell() {
        return cell;
    }

    public void setCell(Object cell) {
        this.cell = cell;
    }
}
