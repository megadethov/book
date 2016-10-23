package full_guide.part_01.chapter_08._04_InheritanceRefDemo;

/**
 * Created by mega on 25.08.2016.
 */
public class A {
    int a;
    void print() {
        System.out.println("AAA");
    }
}
class B extends A {
    int b;
    void display() {
        System.out.println("BBB");
    }
}

class Test {
    public static void main(String[] args) {
        A ref = new A();
        A ref2 = new B();
        B ref3 = new B();
//    B ref4 = new A(); // ссылка подкласса не может ссылаться на суперкласс

        ref.print();
//        ref.display(); // ссылка видит методы только своего класса и его предков
        ref2.print();
//        ref2.display(); // ссылка видит методы только своего класса и его предков
        ref3.print();
        ref3.display();
    }
}
