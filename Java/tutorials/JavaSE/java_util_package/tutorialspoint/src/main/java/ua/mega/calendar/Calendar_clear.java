package ua.mega.java_util.calendar;

import java.util.Calendar;

/**
 * The java.util.Calendar.clear() method sets all the calendar field values and
 * the time value of this Calendar undefined.A Calendar implementation class
 * may use default field values for date and time calculations.
 */
public class Calendar_clear {
    public static void main(String[] args) {

        // create calendar object
        Calendar calendar = Calendar.getInstance();

        // displays the current date and time
        System.out.println("Current calendar date: " + calendar.getTime());

        // use clear method to set all field values and time value as undefined.
        calendar.clear();

        // print the result
        System.out.println("The clear calendar shows: " + calendar.getTime());
    }

}
