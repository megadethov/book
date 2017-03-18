package se.lecture_06_Generics.item_5;

// Для обобщенных типов не работает полиморфизм обычных типов, если объявлен <Number>,
// то положить туда подкласс <Integer> нельзя
// Чтобы сламать Generics, достаточно типизированной ссылке присвоить ссылку на простой,
// не типизированный объект (здесь компилятор уже не контролирует тип)

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimpleType {
    public static void main(String[] args) {
        example1(); // здесь в не типизированную ссылку присваиваем типизированный LinkedList
        example2(); // здесь в типизированную ссылку присваиваем не типизированный LinkedList
    }

    private static void example1() {
        List list = new LinkedList(); // простой не типизированный List оперирует Object
        list.add("First");
        list.add("Second");
        list.add(10);

        // Создаем типизированную ссылку List на не типизмрованный LinkedList, теперь компилятор не контролирует типы
        List<String> list2 = list; // компилируется
//        String s = list2.get(2); // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

//        for (Iterator<String> iter = list2.iterator(); iter.hasNext();)  {
//            System.out.println(iter.next()); // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//        }
    } // example1

    private static void example2() {
        List<String> list = new LinkedList<>(); // типизированный List
        list.add("First");
        list.add("Second");
//        list.add(10);// компилятор сразу прдчеркнет красным

        // Создадим не типизированную ссылку на типизированный LinkedList
        List list2 = list; // все элементы поднимутся до Object
        String s = (String) list2.get(0); // компилятор заставит кастовать к String

        for (Iterator<String> iter = list2.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
