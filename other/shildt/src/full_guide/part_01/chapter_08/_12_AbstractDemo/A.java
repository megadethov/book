package full_guide.part_01.chapter_08._12_AbstractDemo;

/**
 * Created by mega on 26.08.2016.
 */
abstract class A {
    abstract void callMe();
    void callMeToo() {
        System.out.println("Call me too from A");
    }
}
class B extends A {

    @Override
    void callMe() {
        System.out.println("Call me - override from B");
    }
}

class Test {
    public static void main(String[] args) {
        B b = new B();
        b.callMe();
        b.callMeToo();
    }
}
