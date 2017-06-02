package full_guide.part_01.chapter_09._07_InterfaceInheritance;

/**
 * Created by mega on 26.08.2016.
 */
public interface InterfaceA {
    void method1();
    void method2();
}
interface InterfaceB extends InterfaceA {
    void method3();
}

class A implements InterfaceB {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
