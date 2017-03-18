package ua.mega.java_util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * The java.util.Calendar.computeFields() method converts the current
 * millisecond time value time to calendar field values in fields[].
 * This allows syncing up with the calendar field values with a new time
 * that is set for the calendar object.
 */
public class Calendar_computeFields extends GregorianCalendar {
    public static void main(String[] args) {

        // create a new calendar
        Calendar_computeFields calendar = new Calendar_computeFields();

        // print the current date
        System.out.println("The current date is: " + calendar.getTime());

        // clear the calendar
        calendar.clear();

        // set a new year and call computeFields()
        calendar.set(Calendar.YEAR, 1998);
        calendar.computeFields();

        // print the current date
        System.out.println("New date is: " + calendar.getTime());
    }
}
