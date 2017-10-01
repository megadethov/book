package full_guide.part_01.chapter_07._05_ConstructorPassObject;

/**
 * Created by mega on 24.08.2016.
 */
public class ConstructorPassObjectTest {
    public static void main(String[] args) {
        Box box = new Box(10, 20);
        Box box2 = new Box(box); // один объект инициализируется другим
    }
}
