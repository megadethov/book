package full_guide.part_01.chapter_07._06_CallByValue;

/**
 * Created by mega on 24.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue();
        int a = 10;
        int b = 20;
        System.out.println("Начальные значения a и b = " + a + " и " + b);
        callByValue.doubleValue(a, b);
        System.out.println("Значения после работы doubleValue() a и b = " + a + " и " + b);

    }
}
