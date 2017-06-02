package ua.mega.lecture3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yefremov Yuriy
 */

// Отформатировать телефоны и заменить в тексте при печати в виде (987) 654-32-10
public class App4 {
    public static void main(String[] args) {
        String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, "
                + "Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. "
                + "Maggi Hyer, Post bag no 52, Big bank post office, "
                + "Big bank city 56000, ph: 9876501234, Email: maggiO7@myuniverse.com.";
        String regex = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        String newStr = matcher.replaceAll("($1) $2-$3-$4");
        System.out.println(newStr);
    }
}
