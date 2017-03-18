package full_guide.part_01.chapter_07._17_NestedClass;

/**
 * Created by mega on 25.08.2016.
 */
public class Demo3 {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.f();
    }
}
class Outer3 {
    int x = 100;
    void f() {
        for (int i = 0; i < 10; i++) {
            class Inner3 {
                void display() {
                    System.out.print(" " + x);
                }
            }
            Inner3 inner3 = new Inner3(); // для доступа снаружи к inner нужен его instance
            inner3.display();
        } // end for
    }
}

