package full_guide.part_01.chapter_02._05_BlockTest;

/**
 * Created by mega on 21.08.2016.
 */
public class BlockTest {
    public static void main(String[] args) {
        int y = 20;
        for (int x = 0; x < 10; x++) {
            System.out.println("Value of x: " + x);
            System.out.println("Value of y: " + y);
            y -= 2;
        }
    }
}
