package full_guide.part_01.chapter_07._17_NestedClass;

/**
 * Created by mega on 25.08.2016.
 */
// Продемонстрировать применение nested классов
public class Demo1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f();
    }
}

class Outer {
    int x = 100;
    void f() {
//        display(); // invisible here
        Inner inner = new Inner();
        inner.display(); // ч.з. экземпляр inner доступен для outer
    }
    // это nested inner class
    class Inner {
        void display() {
            System.out.println("Print from inner x = " + x);
        }
    }
}