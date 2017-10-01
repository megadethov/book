package ua.mega.java_util.enum_set;

import java.util.EnumSet;

/**
 * The java.util.EnumSet.of(E first, E... rest) method creates an enum set
 * initially containing the specified elements. This factory, whose parameter
 * list uses the varargs feature, may be used to create an enum set initially
 * containing an arbitrary number of elements, but it is likely to run slower
 * than the overloadings that do not use varargs.
 */
public class EnumSet_of_first_rest {

    // create an enum
    public enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {

        // create a set
        EnumSet<Numbers> set;

        // add first element and the rest
        set = EnumSet.of(Numbers.ONE, Numbers.THREE, Numbers.FOUR, Numbers.FIVE);

        // print the set
        System.out.println("Set: " + set);
    }
}
