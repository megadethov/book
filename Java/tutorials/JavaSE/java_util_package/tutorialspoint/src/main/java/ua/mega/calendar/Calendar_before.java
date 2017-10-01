package ua.mega.java_util.calendar;

import java.util.Calendar;

/**
 * The java.util.Calendar.before() method returns whether this Calendar's time is before the time represented by the specified Object (when).
 */
public class Calendar_before {
    public static void main(String[] args) {

        // create calendar objects.
        Calendar calendar = Calendar.getInstance();
        Calendar past = Calendar.getInstance();

        // print the current date
        System.out.println("Current date is: " + calendar.getTime());

        // change year in past calendar
        past.set(Calendar.YEAR, 2006);
        System.out.println("Year is: " + past.get(Calendar.YEAR));

        // check if calendar date is before current date
        if (past.before(calendar)) {
            System.out.println("Before current day: " + past.getTime());
        }

    }
}
