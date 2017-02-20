package ua.mega.java_util.enum_set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;

/**
 * The java.util.EnumSet.copyOf(Collection<E> c) method creates an enum set
 * initialized from the specified collection.
 */
public class EnumSet_copyOf_Collection {

    // create an enum
    public enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {

        // create a new collection
        Collection<Numbers> collection = new ArrayList<>();

        // print the collection
        System.out.println("Collection: " + collection);

        // add two elements in the collection
        collection.add(Numbers.ONE);
        collection.add(Numbers.THREE);

        // create an EnumSet that is a copy of the collection
        EnumSet<Numbers> set = EnumSet.copyOf(collection);

        // print the set
        System.out.println("Set: " + set);
    }

}
