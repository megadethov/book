package full_guide.part_01.chapter_06._03_Box;

/**
 * Created by mega on 24.08.2016.
 */
public class BoxTest4 {
    public static void main(String[] args) {
        Box box = new Box();
        box.height = 10;
        box.width = 20;
        box.depth = 30;

        Box box2 = new Box();
        box2.height = 1;
        box2.width = 2;
        box2.depth = 3;

        System.out.println("Объем 1 равен " + box.volume());
        System.out.println("Объем 2 равен " + box2.volume());
    }
}
