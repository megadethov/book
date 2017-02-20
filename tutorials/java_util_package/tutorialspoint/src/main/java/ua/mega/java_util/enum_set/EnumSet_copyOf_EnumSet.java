package ua.mega.java_util.enum_set;

import java.util.EnumSet;

/**
 * The java.util.EnumSet.copyOf(EnumSet<E> s) method creates an enum set
 * with the same element type as the specified enum set.It contains the
 * same elements (if any).
 */
public class EnumSet_copyOf_EnumSet {

    // create an enum
    public enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {

        // create a set that contains all Numbers class
        EnumSet<Numbers> set1 = EnumSet.allOf(Numbers.class);

        // print set1
        System.out.println("Set1: " + set1);

        // create a second set which is a copy of set1
        EnumSet<Numbers> set2 = EnumSet.copyOf(set1);

        // print the new set
        System.out.println("Set2: " + set2);
    }
}
