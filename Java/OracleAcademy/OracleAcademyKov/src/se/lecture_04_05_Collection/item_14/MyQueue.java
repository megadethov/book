package se.lecture_04_05_Collection.item_14;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("CCC");
        q.add("DDD");
        q.add("AAA");
        q.add("BBB");
        System.out.println(q); // [CCC, DDD, AAA, BBB]

// возвращает первый элемент очереди и УДАЛЯЕТ его из очереди
        System.out.println(q.poll()); // CCC
        System.out.println(q); // [DDD, AAA, BBB]

// возвращает первый элемент очереди и НЕ УДАЛЯЕТ его из очереди
        System.out.println(q.peek()); // DDD
        System.out.println(q); // [DDD, AAA, BBB]

    }
}
