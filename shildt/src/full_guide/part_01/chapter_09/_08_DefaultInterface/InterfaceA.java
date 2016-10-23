package full_guide.part_01.chapter_09._08_DefaultInterface;

/**
 * Created by mega on 26.08.2016.
 */
// с SE8 появились методы по умолчанию
    // позволяют добавлять в старые интерфейсы методы без необходимости их реализовывать в старом коде
    // можно делать заглушки для методов прямо в интерфейсах
public interface InterfaceA {
    // обычный метод
    void oldMethod();

    // метод с реализацией по умолчанию
    default void newMethod() {
        System.out.println("default new");
    }
}

class A implements InterfaceA {

    @Override
    public void oldMethod() {
        System.out.println("override");
    }

//    @Override
//    public void newMethod() {} // эта реализация не обязательна
}

class Test {
    public static void main(String[] args) {
        A a = new A();
        a.oldMethod();
        a.newMethod();
    }
}