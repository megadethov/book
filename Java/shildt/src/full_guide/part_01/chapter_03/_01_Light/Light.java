package full_guide.part_01.chapter_03._01_Light;

/**
 * Created by mega on 21.08.2016.
 */
// Вычислить расстояние, проходимое светом, используя переменные типа long
public class Light {
    public static void main(String[] args) {

        int lightSpeed;
        long days;
        long seconds;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightSpeed = 186000;

        days = 1000; // указатель колличества дней

        seconds = days * 24 * 60 * 60; // преобразовать в секунды

        distance = lightSpeed * seconds; // вычислить расстояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");

    }
}
