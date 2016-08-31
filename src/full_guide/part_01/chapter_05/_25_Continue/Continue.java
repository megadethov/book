package full_guide.part_01.chapter_05._25_Continue;

/**
 * Created by mega on 24.08.2016.
 */
// Продемонстрировать применение оператора continue
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) continue;
            System.out.print(" " + i);
        }
    }
}
