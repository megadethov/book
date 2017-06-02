package full_guide.part_01.chapter_07._05_ConstructorPassObject;

/**
 * Created by mega on 24.08.2016.
 */
public class Box {
    int a;
    int b;

    public Box(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Box(Box box) {
        this.a = box.a;
        this.b = box.b;
    }
}
