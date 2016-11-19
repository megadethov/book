package ua.mega.lecture5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        while (iter.hasNext()) {
            System.out.println(iter.next());
//            iter.remove(); // UnsupportedOperationException
        }

    }
}
