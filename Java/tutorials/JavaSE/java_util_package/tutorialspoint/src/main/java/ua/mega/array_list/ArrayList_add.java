package ua.mega.java_util.array_list;

/*
*The java.util.ArrayList.add(E e) method appends the specified element E to the end of the list.
 */

import java.util.ArrayList;

public class ArrayList_add {
    public static void main(String[] args) {

        // create an empty array list with an initial capacity
        ArrayList<Integer> arrList = new ArrayList<>(5);

        // use add() method to add elements in the list
        arrList.add(15);
        arrList.add(20);
        arrList.add(25);

        // let us print all the elements available in list
        for (Integer i : arrList) {
            System.out.println("Number = " + i);
        }
    }
}
