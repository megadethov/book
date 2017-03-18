package se.lecture_01_AdvancedClasses.item1_6;

/**
 * Created by Yefremov Yuriy
 */
public class Main {
    public static void main(String[] args) {
    }
}

abstract class Parent {// абстрактный класс может не содержать абстрактный метод

    // abstract String ref; // ошибка компиляции, ссылка не может быть abstract
//    abstract public Main() { // ошибка компиляции, конструктор не может быть abstract
//    }
/*переменные и конструкторы не могут быть абстрактными*/

    public abstract void someMethod1(); // абстрактный метод не имеет реализации, тела

    public void someMethod2() { // абстрактный класс может иметь не абстрактный метод
    }
}

class Child extends Parent {
    public Child() {
    }

    @Override
    public void someMethod1() {// так как в классе Main метод someMethod1 -
        // абстрактный,
        // то в наследниках он должн быть переопределен,
        // иначе ошибка компиляции.
    }
    /* public abstract void someMethod3(); // ошибка компиляции,
    // нельзя создать абстрактный метод в не
    // абстрактном классе.*/
}
