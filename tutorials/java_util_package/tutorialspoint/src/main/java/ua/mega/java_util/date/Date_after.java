package ua.mega.java_util.date;

import java.util.Date;

/**
 * The java.util.Date.after(Date when) method checks if this date is after the specified date.
 */
public class Date_after {
    public static void main(String[] args) {

        // create 2 dates
        Date date = new Date(2011, 5, 21);
        Date date2 = new Date(2015, 1, 21);

        // tests if date 2 is after date and print
        boolean after = date2.after(date);
        System.out.println("Date 2 is after date: " + after);

        // tests if date is after date 2 and print
        after = date.after(date2);
        System.out.println("Date is after date 2: " + after);

        // tests two equals date
        after = date.after(date);
        System.out.println("Date is after date : " + after);

    }
}
