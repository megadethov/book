package se.lecture_02_String_StringBuilder_Regexp.item_4;

/**
 * Created by Yefremov Yuriy
 */
public class Main {
    public static void main(String[] args) {
        String s = "The_world_is_mine";
        String name = s.substring(4, s.length() - 8); // индексы символов (включая, не включая)
        System.out.println(name); // world

        String domain = s.substring(13); // c 13(включая) - до конца
        System.out.println(domain); // mine
    }
}
