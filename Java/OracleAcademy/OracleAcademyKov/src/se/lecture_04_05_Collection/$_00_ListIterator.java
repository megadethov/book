package se.lecture_04_05_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class $_00_ListIterator {
    public static void main(String[] args) {
        String str = "ABCBA";

        List<Character> list = new ArrayList<>();
/*        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }*/
        for (Character ch : str.toCharArray()) {
            list.add(ch);
        }

        Iterator<Character> iterator = list.iterator();
        ListIterator<Character> listIterator = list.listIterator(list.size());

        String res = "Palindrom !!!";

        while (iterator.hasNext() && listIterator.hasPrevious()) {
            if (iterator.next() != listIterator.previous()) {
                res = "Not a palindrom";
                break;
            }
        }

        System.out.println(res);
    }
}
