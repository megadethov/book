package full_guide.part_01.chapter_18_Collections._10_SpliteratorDemo;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * Created by mega on 08.09.2016.
 */
// Продемонстрировать простое применение интерфейса Spliterator
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<>();
        al.add(1.0);
        al.add(2.0);
        al.add(3.0);
        al.add(4.0);
        al.add(5.0);
        // Показать содержимое ArrayList с помощью метода tryAdvance()
        Spliterator<Double> split = al.spliterator();
        while (split.tryAdvance((n) -> System.out.println(n)));

        // Создать новый ArrayList, одержащий корни элементов первого al
        split = al.spliterator();
        ArrayList<Double> al2 = new ArrayList<>();
        while (split.tryAdvance((n) -> al2.add(Math.sqrt(n))));
        System.out.println();

        // Показать содержимое ArrayList с помощью метода forEachRemaining()
        split = al2.spliterator();
        split.forEachRemaining((n) -> System.out.println(n)); // здесь while не нужен
    }
}
