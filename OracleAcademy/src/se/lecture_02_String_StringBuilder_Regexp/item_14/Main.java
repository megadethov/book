package se.lecture_02_String_StringBuilder_Regexp.item_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String line = "This order was placed for QT 3 ! OK?";
        String reg = "(.*)(\\d)(.*)";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(line);
        if (m.find()) {
            System.out.println(m.group());
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
        //        System.out.printf("%1$+020.10f", Math.PI);
    }
}
