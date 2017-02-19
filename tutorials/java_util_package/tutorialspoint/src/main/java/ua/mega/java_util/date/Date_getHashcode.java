package ua.mega.java_util.date;

import java.util.Date;

/**
 * The java.util.Date.hashCode() method returns a hash code for this Date object.
 */
public class Date_getHashcode {
    public static void main(String[] args) {

        // create a date
        Date date = new Date(99, 5, 10);

        // display current date
        System.out.println("The current date shows: " + date);

        // get the hash code and print it
        int i = date.hashCode();
        System.out.println("A hash code for this date is: " + i);


    }
}
