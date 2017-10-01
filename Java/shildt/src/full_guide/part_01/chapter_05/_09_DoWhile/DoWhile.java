package full_guide.part_01.chapter_05._09_DoWhile;

/**
 * Created by mega on 23.08.2016.
 */
// Продемонстрировать применение цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int counter = 10;
        do {
            System.out.println("такт № " + counter);
            counter--;
        } while (counter > 0);
    }
}
