package ua.mega.java_util.date;

import java.util.Date;

/**
 * The java.util.Date.before(Date when) method checks if this date is before the specified date.
 */
public class Date_before {
    public static void main(String[] args) {
        // create 2 dates
        Date date = new Date(11, 5, 21);
        Date date2 = new Date(15, 1, 21);

        // tests if date 2 is before date and print
        boolean before = date2.before(date);
        System.out.println("Date 2 is before date: " + before);

        // tests if date is before date 2 and print
        before = date.before(date2);
        System.out.println("Date is before date 2: " + before);

        // tests two equals date
        before = date.before(date);
        System.out.println("Date is before date : " + before);




    }

}
