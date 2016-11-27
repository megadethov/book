package ua.mega.lecture3.regex;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yefremov Yuriy
 */

// Распечатать все почтовые индексы из текста индексы
public class App3 {
    public static void main(String[] args) {
        String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, "
                + "Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. "
                + "Maggi Hyer, Post bag no 52, Big bank post office, "
                + "Big bank city 56000, ph: 9876501234, Email: maggiO7@myuniverse.com.";

//        String regex = "\\d{5}"; // сюда выкусываются и первые 5 цифр из телефонов
        String regex = "\\b\\d{5}\\b"; // задаем границы слова в начале и в конце с помощью \b
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) { // ищет следующее по тексту совпадение
            System.out.println(matcher.group()); // возвращает String совпадения
        }

    }
}
