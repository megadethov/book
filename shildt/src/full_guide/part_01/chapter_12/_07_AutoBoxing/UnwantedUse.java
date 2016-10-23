package full_guide.part_01.chapter_12._07_AutoBoxing;

/**
 * Created by mega on 30.08.2016.
 */
// Нежелательное использование оберток. Т.к. это ведет к доп. издержкам. Лучше примитивы.
public class UnwantedUse {
    public static void main(String[] args) {

        Double d = 10.0;
        Double b = 20d;
        System.out.println(Math.sqrt(d * b));
    }
}
