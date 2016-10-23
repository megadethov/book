package full_guide.part_01.chapter_03._02_Area;

/**
 * Created by mega on 21.08.2016.
 */
// Вычислить площадь круга
public class Area {
    public static void main(String[] args) {
        double pi, r, a;
        r = 10.8; // радиус окружности
        pi = 3.1416; // приблизительное значение числа Пи
        a = pi * r * r; // ычислить площадь круга

        System.out.println("Площадь круга равна: " + a);
    }
}
