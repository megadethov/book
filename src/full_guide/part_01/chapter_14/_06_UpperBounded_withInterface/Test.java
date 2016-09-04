package full_guide.part_01.chapter_14._06_UpperBounded_withInterface;

/**
 * Created by mega on 03.09.2016.
 */
// & - позволяет обязать тип реализовывать интерфейсы
public class Test {
    Holder<classB> ref = new Holder<>(new classB());
//    Holder<classC> ref2 = new Holder<>(new classC()); // не компилируется, т.к. не implements MyInterface
}

class Holder<T extends classB & MyInterface> {
    T ref;

    public Holder(T ref) {
        this.ref = ref;
    }
}

interface MyInterface {
}
class classA  {}
class classB extends classA implements MyInterface {}
class classC extends classA{}
