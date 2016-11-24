package se.lecture_02_String_StringBuilder_Regexp.item_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mega on 24.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(test("BACON"));      //true
        System.out.println(test("BACON BACON"));//false
        System.out.println(test("BACON "));     //false
        System.out.println(test("  BACON"));    //false
        System.out.println(test("BACON  "));    //false
        System.out.println(test("^BACON$"));    //false
        System.out.println(test("bacon"));      //false
    }

    private static boolean test(String testString) {
        //Следующий метод проверит строку на содержание в ней слова BACON и только!
    /*
        ^выражение  =  начало строки
        выражение$  =  конец строки

    */
    // Паттерна метод compile, принимает рег. выражение
        Pattern p = Pattern.compile("^BACON$"); // строго начало и конец строки

        // движок Matcher получаем вызовом у паттерна соотв. метода
        Matcher m = p.matcher(testString);

        return m.matches(); // движок возвращает после проверки boolean
    }
}
