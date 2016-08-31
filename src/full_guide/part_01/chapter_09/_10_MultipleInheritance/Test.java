package full_guide.part_01.chapter_09._10_MultipleInheritance;

/**
 * Created by mega on 27.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Alpha ref = new ClassA();
        Beta ref2 = new ClassA();
        ClassA ref3 = new ClassA();

        ref.reset();
        ref2.reset();
        ref3.reset();

    }
}
