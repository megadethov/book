package se.lecture_01_AdvancedClasses.item1_3;

/**
 * Created by Yefremov Yuriy
 */
// Этот пример демонстрирует интерфейс
public interface MyInterface {
    // поле интерфейса
    String text = "some text"; // public static final - по умолчанию всегда
    // метод интерфейса
    void doSomeWork(); // public по умолчанию (private - не может быть)
}

class A implements MyInterface, Comparable {  // прикол интерфейсов, в том, что их можно ч/з запютую нанизывать

    @Override
    public void doSomeWork() { // class A обязан реализовать метод интерфейса
        System.out.println("Class A has some work");
//        MyInterface.text = "Can't change this field of interface"; // невозможно менять поля интерфейса
//        this.text = "Can't change this field of interface"; // к полю интерфейса можно обратиться ч/з this из override

        // Полиморфизм
//        MyInterface myInterface = new A(); // теперь мы можем создать наш класс с любым из заимплеменченных интерфейсов
//        Comparable comparable = new A(); // теперь мы можем создать наш класс с любым из заимплеменченных интерфейсов
//        A a = new A(); // или под своим классом

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
