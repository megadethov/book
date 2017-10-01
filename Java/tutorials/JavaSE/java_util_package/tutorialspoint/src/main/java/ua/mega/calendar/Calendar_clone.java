package ua.mega.java_util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * The java.util.Calendar.clone() returns a shallow copy of this Calendar object.
 */
public class Calendar_clone {
    public static void main(String[] args) {

        // create new calendar at specific date.
        Calendar calendar = new GregorianCalendar(2008, 01, 20);

        // print date for default value
        System.out.println("Past calendar: " + calendar.getTime()); // month 01 - February !!!

        // create a clone of first cal
        Calendar calendar2 = (Calendar) calendar.clone();

        // display the copy
        System.out.println("Cloned calendar: " + calendar2.getTime());



    }
}
