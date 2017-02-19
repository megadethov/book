package ua.mega.java_util.calendar;

import java.util.Calendar;

/**
 * The java.util.Calendar.clear() method sets the given calendar field
 * valueand the time value of this Calendar undefined. A Calendar
 * implementation class may use default field values for date and time
 * calculations.
 */
public class Calendar_clear_field {
    public static void main(String[] args) {

        // create a calendar
        Calendar calendar = Calendar.getInstance();

        // display the current date and time
        System.out.println("Current Calendar Date: " + calendar.getTime());

        // use clear method to set year as undefined.
        calendar.clear(Calendar.YEAR);

        // print the result
        System.out.println("The calendar shows: " + calendar.getTime());

        // use clear method to set month as undefined.
        calendar.clear(Calendar.MONTH);

        // print the result
        System.out.println("The calendar shows: " + calendar.getTime());

    }
}
