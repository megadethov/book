package se.lecture_04_05_Collection.item_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("C++");
        al.add("Java");

        // Вывод на экран содержимого списка 3-мя способами.

        // обычный for
//        for(Iterator<String> iter = al.iterator(); iter.hasNext(); /*итерация в теле*/) {
//            System.out.println(iter.next());
//        }

        // ч/з while
//        Iterator<String> iter = al.iterator(); // получаем итератор методом iterator(), тк все коллекции Iterable
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

        // у всех Iterable - for each
        for (String s : al) {
            System.out.println(s);
        }
    }
}
