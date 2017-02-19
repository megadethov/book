package ua.mega.java_util.calendar;

import java.util.Calendar;

/**
 * The java.util.Calendar.add() adds or subtracts the specified amount of time (amount) to the given calendar field (field), based on the calendar's rules.
 */
public class Calendar_add {
    public static void main(String[] args) {

        // create a calendar
        Calendar calendar = Calendar.getInstance();

        // print current date
        System.out.println("The current is: " + calendar.getTime());

        // add 20 days to the calendar
        calendar.add(Calendar.DATE, 20);
        System.out.println("20 days later: " + calendar.getTime());

        // subtract 2 months from the calendar
        calendar.add(Calendar.MONTH, -2);
        System.out.println("2 month ago: " + calendar.getTime());

        // subtract 5 year from the calendar
        calendar.add(Calendar.YEAR, -5);
        System.out.println("5 years ago: " + calendar.getTime());
    }
}
