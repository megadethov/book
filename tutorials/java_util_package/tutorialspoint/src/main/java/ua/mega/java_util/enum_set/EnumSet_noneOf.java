package ua.mega.java_util.enum_set;

import java.util.EnumSet;

/**
 * The java.util.EnumSet.noneOf(Class<E> elementType) method creates
 * an empty enum set with the specified element type.
 */
public class EnumSet_noneOf {

    // create an enum
    public enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {

        // create a set that contains all Numbers class
        EnumSet set1 = EnumSet.allOf(Numbers.class);

        // print set1
        System.out.println("Set1: " + set1);

        // create a second set which is empty
        EnumSet<Numbers> set2 = EnumSet.noneOf(Numbers.class);

        // print the new set
        System.out.println("Set2: " + set2);
    }
}
