package full_guide.part_01.chapter_07._04_PassObject;

/**
 * Created by mega on 24.08.2016.
 */
public class PassObjectTest {
    public static void main(String[] args) {
        PassObject passObject = new PassObject(10, 20);
        PassObject passObject2 = new PassObject(10, 20);
        PassObject passObject3 = new PassObject(100, 200);

        System.out.println(passObject.equals(passObject2));
        System.out.println(passObject.equals(passObject3));
    }
}
