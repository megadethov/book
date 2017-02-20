package ua.mega.java_util.enum_set;

import java.util.EnumSet;

/**
 * The java.util.EnumSet.clone() method Returns a copy of this set.
 */
public class EnumSet_clone {

    // create an enum
    public enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {

        // create an EnumSet that has all elements from Numbers
        EnumSet<Numbers> set1 = EnumSet.allOf(Numbers.class);

        // print the set
        System.out.println("Set1: " + set1);

        // create a set2 which is a copy of set1
        EnumSet<Numbers> set2 = set1.clone();

        // print the cloned set2
        System.out.println("Set2: " + set2);

    }
}
