package full_guide.part_01.chapter_05._22_BreakLoop;

/**
 * Created by mega on 24.08.2016.
 */
// Применение break для выхода из цикла while
public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 100) {
            System.out.println(i);
            if (i == 5) break;
        }
        System.out.println("Цикл завершен");
    }
}
