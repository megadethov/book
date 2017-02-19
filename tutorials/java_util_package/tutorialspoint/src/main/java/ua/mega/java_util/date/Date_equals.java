package ua.mega.java_util.date;

import java.util.Date;

/**
 * The java.util.Date.equals(Object obj) method checks if two Dates are equal,based on millisecond difference.
 */
public class Date_equals {
    public static void main(String[] args) {

        // create 2 dates
        Date date = new Date(70, 1, 10);
        Date date2 = new Date(70, 1, 10);

        // Check if they are equal
        boolean check = date.equals(date2);

        // print the result
        System.out.println("Dates are equal: " + check);

    }
}
