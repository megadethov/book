package se.lecture_02_String_StringBuilder_Regexp.item_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mega on 24.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(test("trololo.com"));     //true
        System.out.println(test("trololo.ua "));     //false
        System.out.println(test("trololo.ua"));      //true
        System.out.println(test("trololo/ua"));      //false
        System.out.println(test("i love java because it is cool.ru"));      //true
        System.out.println(test("BACON.ru"));        //true
        System.out.println(test("BACON.de"));        //false
    }

    private static boolean test(String testString) {
 // все что угодно(.*) до точки(\.), точку экранируем обр. слешем и сам слеш тоже экранируем, а после точки один из 3 доменов
        Pattern p = Pattern.compile(".*\\.(com|ua|ru)");
        Matcher m = p.matcher(testString);
        return m.matches();

    }
}
