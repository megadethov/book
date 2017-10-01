package se.lecture_02_String_StringBuilder_Regexp.item_2;

/**
 * Created by Yefremov Yuriy
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello"; // Пулл строк
        String str2 = new String(str1); // Хип
        String str3 = new String("Hello"); // Хип

        boolean isEqual1 = str1 == str2; // false, разные объекты
        // str1 хранится в пуле строк,
        // str2 - в хипе

        boolean isEqual2 = str1.equals(str3); // true, объекты эквивалентны

        boolean isEqual3 = str1.equals("hello"); // false, объекты не эквивалентны, метод equals чувствителен к регистру (case sensitive)

        System.out.println(isEqual1);
        System.out.println(isEqual2);
        System.out.println(isEqual3);

    }
}
