package full_guide.part_01.chapter_08._08_Overriding;

/**
 * Created by mega on 26.08.2016.
 */
public class OverridingTest {
    public static void main(String[] args) {
        B b = new B(1, 2, 3); // вызывается переопределенный метод подкласса B
        b.print();

    }
}

class A {
    int a1 = 10;
    int a2 = 20;

//    public A() {}

    public A(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    void print() {
        System.out.println("a1, a2 = " + a1 + ", " + a2);
    }
}
class B extends A {
    int b;
    public B(int a1, int a2, int b) {
        super(a1, a2);
        this.b = b;
    }

    @Override
    void print() {
        System.out.println("b = " + b);
        super.print();
    }
}
