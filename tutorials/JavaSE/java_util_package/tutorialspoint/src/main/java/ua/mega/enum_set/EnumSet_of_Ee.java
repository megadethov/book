package ua.mega.java_util.enum_set;

import java.util.EnumSet;

/**
 * The java.util.EnumSet.of(E e) method creates an enum set initially containing the specified element.
 */
public class EnumSet_of_Ee {

    // create an enum
    public enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {

        // create a set
        EnumSet<Numbers> set;

        // add one element
        set = EnumSet.of(Numbers.FIVE);

        // print the set
        System.out.println("Set: " + set);

        // add another element which replaces the previous
        set = EnumSet.of(Numbers.THREE);

        // print the set. Notice that it has one element
        System.out.println("Set: " + set);

    }


}
