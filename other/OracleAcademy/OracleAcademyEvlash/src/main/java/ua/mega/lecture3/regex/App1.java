package ua.mega.lecture3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yefremov Yuriy
 */
public class App1 {
    public static void main(String[] args) {
        String str = "mama"; // строка 1
        String str2 = "papa"; // строка 2
        String regex = "[mp]a[pm]a"; // регулярное выражение
        // Создаем Pattern с помощью статического метода compile("String regex")
        Pattern pattern = Pattern.compile(regex);
        // еще один статик метод класса Pattern - matcher(исходная строка) - чтобы получить экземпляр класса Matcher
//        Matcher matcher = pattern.matcher(str); // Matcher описывает совпадения и методы для работы с ними
        Matcher matcher = pattern.matcher(str2); // Matcher описывает совпадения и методы для работы с ними
        System.out.println(matcher.matches());
        // Обе строки при сравнении с маской - true

    }
}
