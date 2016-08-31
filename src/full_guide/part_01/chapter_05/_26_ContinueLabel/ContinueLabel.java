package full_guide.part_01.chapter_05._26_ContinueLabel;

/**
 * Created by mega on 24.08.2016.
 */
// Применение оператора continue с меткой
public class ContinueLabel {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(" " + (i * j));
                if (i == j) {
                    System.out.println();
                    continue label;
                }
            }
        }

    }
}

