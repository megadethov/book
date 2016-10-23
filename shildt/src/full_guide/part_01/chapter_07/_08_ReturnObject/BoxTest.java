package full_guide.part_01.chapter_07._08_ReturnObject;

/**
 * Created by mega on 24.08.2016.
 */
public class BoxTest {
    public static void main(String[] args) {

        Box box = new Box(10);
        System.out.println(box.a);

        Box box2 = box.returnObj();
        System.out.println(box2.a);


    }
}
