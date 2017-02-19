package ua.mega.java_util.date;

import java.util.Date;

/**
 * The java.util.Date.clone() returns a shallow copy of this Date object.
 */
public class Date_clone {
    public static void main(String[] args) {
        // create a date
        Date date = new Date(98, 5, 21);

        // clone it to a second date
        Object date2 = date.clone();

        // print the results
        System.out.println("Original Date: " + date.toString());
        System.out.println("Cloned date: " + date2.toString());
    }
}
