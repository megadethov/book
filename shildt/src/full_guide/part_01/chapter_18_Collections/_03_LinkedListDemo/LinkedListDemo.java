package full_guide.part_01.chapter_18_Collections._03_LinkedListDemo;

import java.util.LinkedList;

/**
 * Created by mega on 07.09.2016.
 */
// Продемотнстрировать применение класса LinkedList
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println(ll);

        // удалить элементы
        ll.remove("F");
        ll.remove(2);
        System.out.println(ll);

        // удалить первый и последний элементы
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        // получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + "change"); // set возвращает заменяемое значение
        System.out.println(ll);


    }
}

//    Первый конструктор создает пустой связный список, а второй - связный список
//        и инициирует его содержимым коллекции с. В классе LinkedList реализуется
//        интерфейс Deque, и благодаря этому становятся доступными методы, определенные
//        в интерфейсе Deque. Например, чтобы ввести элементы в начале списка, достаточно
//        вызвать метод addFirst(} или offerFirst(}, а для того чтобы ввести
//        элементы в конце списка - метод addLast() или offerLast(}. Чтобы получить
//        первый элемент из списка, следует вызвать метод getLast(} или peekLast(},
//        а для того чтобы удалить первый элемент из списка - метод remove First() или
//        pollFirst(}. И наконец, чтобы получить последний элемент из списка, следует
//        вызвать метод getLast(} или peekLast(}, а для того чтобы удалить последний
//        элемент из списка - метод removeLast(} или pollLast(}.