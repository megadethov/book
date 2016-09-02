package full_guide.part_01.chapter_13._11_instanceof_strictfp;

/**
 * Created by mega on 02.09.2016.
 */
public class InstanceofDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a instanceof A); // true
        System.out.println(b instanceof A); // true
        System.out.println(a instanceof B); // false

    }
}

class A {

}
class B extends A {

}