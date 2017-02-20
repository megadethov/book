package ua.mega.java_api.java2s.java.text.date_format;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Output:
 Japan: 4/28/06
 Korea: Apr 28, 2006
 United Kingdom: 28 April 2006
 United States: Friday, April 28, 2006
 */
public class DateFormatFULL {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;

        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japan: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Korea: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("United Kingdom: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("United States: " + df.format(date));
    }
}
