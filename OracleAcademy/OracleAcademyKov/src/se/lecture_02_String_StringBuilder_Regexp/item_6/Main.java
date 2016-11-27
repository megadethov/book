package se.lecture_02_String_StringBuilder_Regexp.item_6;

/**
 * Created by Yefremov Yuriy
 */

public class Main {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abce";
        String str3 = "aabc";
        String str4 = "aAbc";

        System.out.println(str1.equals(str2)); // false - проверяет на эквивалентность
        System.out.println(str1.compareTo(str2)); // "-"(так как d < e) - сравнивает строки в лексикографическом порядке

        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.compareTo(str3)); // "+"(так как b > a)

        System.out.println(str3.equals(str4)); // false
        System.out.println(str3.compareTo(str4)); // "+"(так как a > A) A a
        System.out.println(str3.compareToIgnoreCase(str4)); // 0 (так как a == A без учета регистра)



    }
}
