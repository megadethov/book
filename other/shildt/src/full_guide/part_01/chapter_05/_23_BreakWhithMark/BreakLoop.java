package full_guide.part_01.chapter_05._23_BreakWhithMark;

/**
 * Created by mega on 24.08.2016.
 */
// Применение break для выхода из вложенных циклов
public class BreakLoop {
    public static void main(String[] args) {
       mark: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("val = " + i + "   j = " + j );
                if (j == 10) break mark; // выход из всех циклов
            }
        }
        System.out.println("Все циклы завершены");
    }
}
