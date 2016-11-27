package se.lecture_02_String_StringBuilder_Regexp.item_5;

/**
 * Created by Yefremov Yuriy
 */
public class Main {
    public static void main(String[] args) {
        String myPhoneNumber = "(+3)8-093-1234567";

// разделяем строку на отдельные строки по символу -
        String[] byDigit = myPhoneNumber.split("-"); // получаем массив строк
        // читаем полученный массив строк
        for (String s : byDigit) {
            System.out.println(s);
        }

        System.out.println("Operator's code is " + byDigit[1]); // Operator's code is 093

        System.out.println("Phone number without code " + byDigit[2]);// Phone number without code 1816482

    }
}
