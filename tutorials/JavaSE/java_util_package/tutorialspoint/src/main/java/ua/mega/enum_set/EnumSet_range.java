package ua.mega.java_util.enum_set;

import java.util.EnumSet;

/**
 * The java.util.EnumSet.range(E from,E to) method creates an enum set
 * initially containing all of the elements in the range defined by the two
 * specified endpoints.
 */
public class EnumSet_range {

    // create an enum
    public enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {

        // create a set
        EnumSet<Numbers> set;

        // add 3 elements
        set = EnumSet.range(Numbers.TWO, Numbers.FOUR);

        // print the set
        System.out.println("Set: " + set);

    }
}
