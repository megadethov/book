package se.lecture_01_AdvancedClasses.item1_2;

/**
 * Created by Yefremov Yuriy
 */
//Этот пример показывает полиморфизм в действии. Конкретный метод выбирается в рантайм.
abstract class Parent {
    void print() {
        System.out.println("Main print");
    }
}

class LittleChild extends Parent {
    @Override
    void print() {
        System.out.println("LittleChild print");
    }
}

class BigChild extends Parent {
    @Override
    void print() {
        System.out.println("BigChild print");
    }
}

public class MyAbstractMethod {
    public static void main(String[] args) {
        // обе ссылки родительские, а инстансы конкретных детей
        Parent littleChild = new LittleChild();
        Parent bigChild = new BigChild();
        littleChild.print(); // будет вызван переопределенный метод LittleChild
        bigChild.print(); // будет вызван переопределенный метод BigChild


    }
}
