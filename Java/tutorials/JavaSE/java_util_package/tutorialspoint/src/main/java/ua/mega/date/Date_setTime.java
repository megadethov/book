package ua.mega.java_util.date;

import java.util.Date;

/**
 * The java.util.Date.setTime(long time) method sets this Date to show time milliseconds after January 1, 1970 00:00:00 GMT.
 */
public class Date_setTime {
    public static void main(String[] args) {

        // create a date
        Date date = new Date(92, 1, 10);

        // set the time for 10000 milliseconds after january 1, 1970 00:00:00 gmt.
        date.setTime(10000);

        // print the result
        System.out.println("Time after settings: " + date);
    }
}
