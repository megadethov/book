package ua.mega.java_util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * The java.util.Calendar.complete() method fills in any unset fields in the calendar fields.
 */
public class Calendar_complete extends GregorianCalendar {
    public static void main(String[] args) {

        // create a new calendar
        Calendar_complete calendar = new Calendar_complete();

        // print the current date
        System.out.println("Current Calendar is: " + calendar.getTime());

        // clear the calendar
        calendar.clear();

        // set a new year and call complete()
        calendar.set(Calendar.YEAR, 1998);
        calendar.complete();

        // print the current date
        System.out.println("New date is: " + calendar.getTime());


    }
}
