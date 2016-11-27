package se.lecture_02_String_StringBuilder_Regexp.item_3;

/**
 * Created by Yefremov Yuriy
 */
public class Main {
    public static void main(String[] args) {
        String str = "Some text";
        int last = str.length() - 1; // номер последнего символа, -1, так как отсчет начинается с 0

        char ch = str.charAt(last); // берем последний символ
        System.out.println(ch); // выводит "t"
    }
}
