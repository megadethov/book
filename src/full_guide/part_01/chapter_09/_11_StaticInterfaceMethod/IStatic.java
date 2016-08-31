package full_guide.part_01.chapter_09._11_StaticInterfaceMethod;

/**
 * Created by mega on 27.08.2016.
 */
public interface IStatic {
    void f();
    default void f2() {
        System.out.println("f2 - default");
    }
    static int f3() { // вызывается ч\з имя.метод, не наследуется и не имплементится
        System.out.println("f3 - static");
        return 0;
    }
}

class A implements IStatic {

    @Override
    public void f() {
        System.out.println("f - override");
    }
}

class Test {
    public static void main(String[] args) {
        A a = new A();
        a.f();
        a.f2();
//        a.f3(); // статик метод не доступен ч\з implements
        IStatic.f3(); // доступен ч\з имя интерфейса
    }
}