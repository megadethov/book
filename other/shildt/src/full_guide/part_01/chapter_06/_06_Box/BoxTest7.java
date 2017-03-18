package full_guide.part_01.chapter_06._06_Box;

/**
 * Created by mega on 24.08.2016.
 */
public class BoxTest7 {
    public static void main(String[] args) {
        Box box = new Box(1, 2, 3);
        Box box2 = new Box(10, 20, 30);

        System.out.println("Объем 1 равен " + box.volume());
        System.out.println("Объем 2 равен " + box2.volume());
    }
}
