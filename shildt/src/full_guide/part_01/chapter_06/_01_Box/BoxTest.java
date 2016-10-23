package full_guide.part_01.chapter_06._01_Box;

/**
 * Created by mega on 24.08.2016.
 */
// Рассчитать объем параллелепипеда
public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        box.width = 10;
        box.height = 20;
        box.depth = 30;

        System.out.println("Объем равен " + (box.width * box.height * box.depth));
    }
}
