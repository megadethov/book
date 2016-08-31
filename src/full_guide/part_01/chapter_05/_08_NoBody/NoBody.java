package full_guide.part_01.chapter_05._08_NoBody;

/**
 * Created by mega on 23.08.2016.
 */
// Целевая часть цикла может быть пустой
public class NoBody {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        // рассчитать среднее сначение a и b
        while (++a < --b);

        System.out.println("Среднее равно " + a);
    }
}
