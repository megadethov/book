package se.lecture_06_Generics.item_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMask {
    static void printList(List<?> list) { // принимает в параметрах List чего угодно
        for (Object l : list) {
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        // создаем два разных List
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c"));

        printList(list);
        printList(list2);
    }
}


