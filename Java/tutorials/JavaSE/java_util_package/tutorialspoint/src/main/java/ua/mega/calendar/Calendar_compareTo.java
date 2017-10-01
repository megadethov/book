package ua.mega.java_util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * The java.util.Calendar.compareTo() method compares the time values (millisecond offsets)
 * between the Calendar object and anotherCalendar object.
 */
public class Calendar_compareTo {
    public static void main(String[] args) {
        // create two calendar at the different dates
        Calendar calendar1 = new GregorianCalendar(2015, 8, 15);
        Calendar calendar2 = new GregorianCalendar(2008, 1, 02);

        // compare the time values represented by two calendar objects.
        int i = calendar1.compareTo(calendar2);

        // return positive value if equals else return negative value
        System.out.println("The result is: " + i);

        // compare again but with the two calendars swapped
        int j = calendar2.compareTo(calendar1);

        System.out.println("The result is :" + j);

    }
}
