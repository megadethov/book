package se.lecture_02_String_StringBuilder_Regexp.item_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mega on 24.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(test("612pizza"));   //true
        System.out.println(test("@pizza"));  //false
        System.out.println(test("pizza3"));  //false

        System.out.println(test1("-"));   //true
        System.out.println(test1("?"));   //true
        System.out.println(test1("_"));   //true
        System.out.println(test1("??"));  //true
        System.out.println(test1("??_")); //true
        System.out.println(test1("????"));//false
    }

    private static boolean test1(String testString) {
        Pattern p = Pattern.compile("^[a-z0-9?_-]{1,3}$");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    private static boolean test(String testString) {
        //  [а-г]  =  любое из значений в промежутке
        //  выражение+  =  1 или более раз

        Pattern p = Pattern.compile("[1-9]+[a-z]+");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
}
