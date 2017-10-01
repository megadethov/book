package full_guide.part_01.chapter_18_Collections._07_ArrayDeque;

import java.util.ArrayDeque;

/**
 * Created by mega on 08.09.2016.
 */
// Продемонстрировать применение класса ArrayDeque

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // создать двустороннюю очередь
        ArrayDeque<String> ad = new ArrayDeque<>();
// использовать ad для создания стека
        ad.push("A"); // push обавляет значения в стек
        ad.push("B");
        ad.push("D");
        ad.push("E");
        ad.push("F");
        System.out.println(ad);

        // Извлечение стека
        // peak считывает, но не удаляет значение из стека
        // pop считывает и удаляет значение из стека
        while (ad.peek() != null) System.out.print(ad.pop() + "- ");
    }

}
