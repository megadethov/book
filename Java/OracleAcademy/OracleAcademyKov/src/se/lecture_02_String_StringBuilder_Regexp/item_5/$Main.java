package se.lecture_02_String_StringBuilder_Regexp.item_5;

/**
 * Created by Yefremov Yuriy
 */
public class $Main {
    public static void main(String[] args) {
        String myPhoneNumber = "(+3)8-093-1234567";

        String[] strings = myPhoneNumber.split("-");
        for (String next : strings) {
            System.out.println(next);
        }

    }
}
