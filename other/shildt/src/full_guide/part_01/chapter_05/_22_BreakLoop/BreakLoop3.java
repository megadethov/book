package full_guide.part_01.chapter_05._22_BreakLoop;

/**
 * Created by mega on 24.08.2016.
 */
// Break аботает только для текущего цикла
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(" " + j);
                if (j == 10) break; // относится только к внутреннему циклу
            }
            System.out.println();
        }
        System.out.println("Все циклы завершены");
    }
}
