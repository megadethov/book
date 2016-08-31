package full_guide.part_01.chapter_08._10_Dispatch;

/**
 * Created by mega on 26.08.2016.
 */
// Динамическая диспетчеризация методов
public class A {
    void print() {
        System.out.println("A");
    }
}
class B extends A {
    @Override
    void print() {
        System.out.println("B");
    }
}
class C extends A {
    @Override
    void print() {
        System.out.println("C");
    }
}
class Test {
    public static void main(String[] args) {
        A ref = new A();
        A ref2 = new B();
        A ref3 = new C();
        ref.print();
        ref2.print();
        ref3.print();
    }
}
