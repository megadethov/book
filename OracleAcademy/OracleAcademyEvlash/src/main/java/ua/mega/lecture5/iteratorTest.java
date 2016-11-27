package ua.mega.lecture5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Yefremov Yuriy
 */
public class iteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Five");
        list.add("Four");
        list.add("Two");

        Iterator<String> iter = list.iterator();
        ListIterator<String> lIter = list.listIterator(2); // можно указать индекс для старта
        while (iter.hasNext()) {
            System.out.println(iter.next());
//            iter.remove(); // UnsupportedOperationException
        }

    }
}
