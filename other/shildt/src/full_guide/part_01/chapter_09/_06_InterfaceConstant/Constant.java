package full_guide.part_01.chapter_09._06_InterfaceConstant;

/**
 * Created by mega on 26.08.2016.
 */
public interface Constant {
    int i = 10; // final static by default
//    int x; // нужна инициализация обязательно
    final public static int y = 100;
}

class A implements Constant {
    void f() {
//    val = 100; // нельзя изменить final переменную
    }
}

class B {
    void print() {
        System.out.println(Constant.i);
    }
}


