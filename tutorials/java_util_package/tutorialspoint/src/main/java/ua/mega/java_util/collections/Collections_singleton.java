package ua.mega.java_util.collections;

import java.util.*;

/**
 * The singleton(T) method is used to return an immutable set containing only the specified object.
 * public static <T> Set<T> singleton(T o)
 */
public class Collections_singleton {
    public static void main(String[] args) {

        //create an array of string objs
        String[] init = {"One", "Two", "Three", "One", "Two", "Three"};

        // create two lists
        List<String> list1 = new ArrayList<>(Arrays.asList(init));
        List<String> list2 = new ArrayList<>(Arrays.asList(init));

        // remove from list1
        list1.remove("One");
        System.out.println("List1 value: " + list1);

        // singleton - immutable
        Set<String> one = Collections.singleton("One");
//        one.add("Two"); // java.lang.UnsupportedOperationException

        list2.removeAll(one);
        System.out.println("The SingletonList is :" + list2);
    }
}
