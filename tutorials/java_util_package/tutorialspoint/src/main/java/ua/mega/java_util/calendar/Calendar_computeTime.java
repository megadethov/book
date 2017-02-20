package ua.mega.java_util.calendar;

import java.util.GregorianCalendar;


/**
 * The java.util.Calendar.computeFields() method is used to convert the current calendar field values in fields[]
 * to the millisecond time value time.
 */
public class Calendar_computeTime extends GregorianCalendar {
    public static void main(String[] args) {
        // create a new calendar
        Calendar_computeTime calendar = new Calendar_computeTime();

        // print the current date
        System.out.println("The current date is: " + calendar.getTime());

        // clear the calendar
        calendar.clear();

        // set a new year and call computeTime()
        calendar.set(GregorianCalendar.YEAR, 1998);
        calendar.computeTime();

        // print the current date
        System.out.println("New date is: " + calendar.getTime());


    }
}
