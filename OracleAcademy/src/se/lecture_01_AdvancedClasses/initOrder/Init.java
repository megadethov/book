package se.lecture_01_AdvancedClasses.initOrder;

/**
 * Created by Yefremov Yuriy
 */
// Всегда первым делом инициализируется вся статика Родителя в порядке объявления
// Далее идет вся статика Потомка в порядке объявления
// После этого все не статик поля Родителя в порядке объявления
// Только после этого конструктор Родителя
// Затем все не статик поля Потомка в порядке объявления
// И наконец конструктор Потомка
public class Init {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}

class Parent {
    // статическая секция1 инициализации
    static {
        System.out.println("pStatic1");
    }

    // при инициации переменной сначала дернут метод
    private int i = test(); // зачем? Чтобы иметь sout при инициации переменной

    // не статик блок инициируется в том же порядке что и не статик переменные
    {
        System.out.println("P block not static");
    }

    private int test() {
        System.out.println("Parent init var");
        return 10;
    }

    // статическая секция2 инициализации (статик секция или переменная не важно для порядка инициации)
    static {
        System.out.println("pStatic2");
    }

    // Конструктор
    // Если определить только свой конструктор - то дефолтный без параметров исчезает и его нужно явно определять
//    public Parent(int i) {
//        System.out.println("Parent constructor");
//    }

    // Конструктор
    public Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    // статическая секция1 инициализации
    static {
        System.out.println("cStatic1");
    }

    // при инициации переменной сначала дернут метод
    private int i = test(); // зачем? Чтобы иметь sout при инициации переменной

    // не статик блок инициируется в том же порядке что и не статик переменные
    {
        System.out.println("С block not static");
    }

    private int test() {
        System.out.println("Child init var");
        return 10;
    }

    // статическая секция2 инициализации (статик секция или переменная не важно для порядка инициации)
    static {
        System.out.println("cStatic2");
    }

    // Конструктор
    // Если у Парента нет дефолтного конструктора, то нужно переопределить его сущ. конструктор
//    public Child(int i) {
//        super(i); // и первой строчкой должен вызываться конструктор Парента
//    }

    // Конструктор
    public Child() {
//        super(100); // первой строкой требуется вызвать конструктор суперкласса, если у него нет дефолтного
        System.out.println("Child constructor");
    }

}