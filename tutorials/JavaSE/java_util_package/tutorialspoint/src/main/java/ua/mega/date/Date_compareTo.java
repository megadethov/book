package ua.mega.java_util.date;

import java.util.Date;

/**
 * Created by mega
 */
public class Date_compareTo {
    public static void main(String[] args) {

        // create two dates
        Date date = new Date(116, 5, 21); // year = 1900 + int
        Date date2 = new Date(117, 1, 9);

        // make 3 comparisons with them
        int comparison = date.compareTo(date2);
        int comparison2 = date2.compareTo(date);
        int comparison3 = date.compareTo(date);

        // print the results
        System.out.println("Comparison Result:" + comparison);
        System.out.println("Comparison2 Result:" + comparison2);
        System.out.println("Comparison3 Result:" + comparison3);
    }
}
