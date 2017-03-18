package full_guide.part_01.chapter_08._09_InheritanceOverloading;

/**
 * Created by mega on 26.08.2016.
 */
public class A {
    void print() {
        System.out.println("A");
    }
}

class B extends A {
    void print(String msg) { // это overloading, а не overriding, т.к. разные параметры
        System.out.println(msg);
    }
}

class Test {
    public static void main(String[] args) {
        B b = new B();
        b.print();
        b.print("overloading in B");

    }
}
