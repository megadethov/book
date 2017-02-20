package ua.mega.java_util.enum_set;

import java.util.EnumSet;

/**
 * The java.util.EnumSet.allOf(Class<E> elementType) method creates an enum set containing all of
 * the elements in the specified element type.
 */
public class EnumSet_allOf {

    // create an enum
    public enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {
        // create an empty EnumSet
        EnumSet<Numbers> set = null;

        // print the set
        System.out.println(set);

        // create the set by getting all elements from Numbers
        set = EnumSet.allOf(Numbers.class);

        // print the updated set
        System.out.println("Updated set: " + set);

    }
}
