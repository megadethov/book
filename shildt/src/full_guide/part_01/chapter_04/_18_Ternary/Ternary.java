package full_guide.part_01.chapter_04._18_Ternary;

/**
 * Created by mega on 23.08.2016.
 */
// Продемонстрировать применение тернарной операции
public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной val
        System.out.println("Абсолютное значение переменной "+ i + " = " + k);

        i = -10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной val
        System.out.println("Абсолютное значение переменной "+ i + " = " + k);
    }
}
