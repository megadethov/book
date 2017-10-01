package full_guide.part_01.chapter_05._22_BreakLoop;

/**
 * Created by mega on 24.08.2016.
 */
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 10) break;
        }
        System.out.println("Цикл завершен");
    }
}
