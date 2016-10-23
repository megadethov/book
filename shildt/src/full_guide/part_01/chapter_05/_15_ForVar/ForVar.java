package full_guide.part_01.chapter_05._15_ForVar;

/**
 * Created by mega on 24.08.2016.
 */
// Отдельные части оператора for могут отсутствовать
public class ForVar {
    public static void main(String[] args) {
        boolean flag = false;
        int i = 0;
        for (; !flag; ) {
            System.out.print(" " + i);
            if (i == 9) flag = true;
            i++;
        }
    }
}
