package full_guide.part_01.chapter_07._03_OverloadConstructor;

/**
 * Created by mega on 24.08.2016.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box(10);
        Box box3 = new Box(1, 2, 3);

        System.out.println("box.volume " +  box.volume());
        System.out.println("box2.volume " +  box2.volume());
        System.out.println("box3.volume " +  box3.volume());

    }
}
