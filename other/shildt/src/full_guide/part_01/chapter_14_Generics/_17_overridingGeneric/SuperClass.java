package full_guide.part_01.chapter_14_Generics._17_overridingGeneric;

/**
 * Created by mega on 06.09.2016.
 */
public class SuperClass<T> {
    T superObject;

    public SuperClass(T superObject) {
        this.superObject = superObject;
    }

    void print() {
        System.out.println(superObject);
    }
}
class SubClass<T> extends SuperClass {


    public SubClass(T superObject) {
        super(superObject);
    }

    @Override
    void print() {
        System.out.println(superObject);
    }
}

class Test {
    public static void main(String[] args) {
        SuperClass<String> superClass = new SuperClass<>("Super from super");
        SubClass<String> subClass = new SubClass("Super from sub");

        subClass.print();
        superClass.print();
    }
}
