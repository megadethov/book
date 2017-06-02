package full_guide.part_01.chapter_18_Collections._04_HashSetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by mega on 07.09.2016.
 */
// Продемонстрировать применеие класса HashSet
public class HashSetDemo {
    public static void main(String[] args) {
//        HashSet<String> hs = new HashSet<>(); // порядок не поддерживается, сортировки нет
        LinkedHashSet<String> hs = new LinkedHashSet<>(); // поддерживает порядок вставки
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        hs.add("six");
        hs.add("seven");
        hs.add("eight");
        hs.add("nine");
        hs.add("ten");
        hs.add("ten"); // дубликат не поддерживается
        System.out.println(hs); // порядок не поддерживается, сортировки нет
        System.out.println(hs.contains("one"));



    }
}
