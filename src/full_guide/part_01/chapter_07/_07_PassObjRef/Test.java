package full_guide.part_01.chapter_07._07_PassObjRef;

/**
 * Created by mega on 24.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        PassObjRef ref = new PassObjRef(10, 20);
        System.out.println("Before a and b " + ref.a + " and " + ref.b);
        ref.doubleValue(ref);
        System.out.println("After a and b " + ref.a + " and " + ref.b);
    }
}
