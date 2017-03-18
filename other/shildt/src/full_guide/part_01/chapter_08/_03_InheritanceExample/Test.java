package full_guide.part_01.chapter_08._03_InheritanceExample;

/**
 * Created by mega on 25.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Box box = new Box(1, 2, 3);
        WeightBox weightBox = new WeightBox(10, 20, 30, 100);

        box.volume(weightBox);
        weightBox.volume(weightBox);
    }
}
