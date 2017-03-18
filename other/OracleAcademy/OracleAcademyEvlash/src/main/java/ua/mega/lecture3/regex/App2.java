package ua.mega.lecture3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yefremov Yuriy
 */

// жадная и ленивая квантификация
public class App2 {
    public static void main(String[] args) {
        String str = "<р>Это простой <Ь>текст</Ь> для примера </р> особенностей квантификаторов";
//        String regex = "<.*>"; // жадный - зогребает все от первой открывающейся до последней закрывающейся
        String regex = "<.*?>"; // ленивый - зогребает все от первой открывающейся до первой закрывающейся
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.replaceAll("<replace>"));

    }
}
