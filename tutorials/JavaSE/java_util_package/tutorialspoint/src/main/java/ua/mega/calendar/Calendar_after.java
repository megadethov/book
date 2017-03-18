package ua.mega.java_util.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * The java.util.Calendar.after() method returns whether this Calendar's time is after the time represented by the specified Object (when).
 */
public class Calendar_after {
    public static void main(String[] args) {

        // create calendar objects
        Calendar calendar = Calendar.getInstance();
        Calendar future = Calendar.getInstance();

        // print the current date
        System.out.println("Current date: " + calendar.getTime());

        // change year in future calendar
        future.set(Calendar.YEAR, 2020);
        System.out.println("Year is: " + future.get(Calendar.YEAR));

        // check if calendar date is after current date
        Date time = future.getTime();
        if (future.after(calendar)) {
            System.out.println("Date " + time + " is after current date.");
        }
    }
}
