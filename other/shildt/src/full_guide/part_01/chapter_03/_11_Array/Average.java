package full_guide.part_01.chapter_03._11_Array;

/**
 * Created by mega on 22.08.2016.
 */
// Вычисление среднего из значений массива
public class Average {
    public static void main(String[] args) {
        double[] num = {10.1, 11.2, 12.3, 13.4, 14.5};
        double res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        System.out.println("Среднее значение равно " + res);
    }
}
