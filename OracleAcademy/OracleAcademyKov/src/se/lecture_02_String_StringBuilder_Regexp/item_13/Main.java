package se.lecture_02_String_StringBuilder_Regexp.item_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mega on 24.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        String str = "регулярные выражения это круто регулярные " +
                "выражения это круто регулярные выражения это ведь круто " +
                "якороль ВСЕ отлично)) якороль регулярные выражения это круто ";

        Pattern p = Pattern.compile("(ведь).+(якороль).+(\\2)");
        //      Pattern p = Pattern.compile("(ведь).+(якороль).+(якороль)"); // эквивалентный паттерн

        Matcher m = p.matcher(str);
        if (m.find()) {
            System.out.println(m.group());
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }
    }
}
