package ua.mega.java_util.enum_set;

import java.util.EnumSet;

/**
 * The java.util.EnumSet.complementOf(EnumSet<E> s) method creates an enum set
 * with the same element type as the specified enum set.It contains all
 * the elements of this type that are not contained in the specified set.
 */
public class EnumSet_complementOf {

    // create an enum
    public enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {

        // create an EnumSet that has only Numbers.FOUR as element
        EnumSet<Numbers> set1 = EnumSet.of(Numbers.FOUR);

        // print the set
        System.out.println("Set1: " + set1);

        // create a set2 which has all elements that set1 doesn't have
        EnumSet<Numbers> set2 = EnumSet.complementOf(set1);

        // print the set2
        System.out.println("Set2: " + set2);

    }

}
