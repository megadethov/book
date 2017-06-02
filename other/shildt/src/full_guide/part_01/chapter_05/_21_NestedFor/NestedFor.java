package full_guide.part_01.chapter_05._21_NestedFor;

/**
 * Created by mega on 24.08.2016.
 */
// Циклы могут быть вложенными
public class NestedFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
