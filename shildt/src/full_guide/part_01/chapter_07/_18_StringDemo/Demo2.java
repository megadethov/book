package full_guide.part_01.chapter_07._18_StringDemo;

/**
 * Created by mega on 25.08.2016.
 */
// Продемонстрировать некоторые методы из класса String
public class Demo2 {
    public static void main(String[] args) {
        String str = "First String";
        String str2 = "Second String";
        String str3 = str;

        System.out.println("str length = " + str.length());
        System.out.println("3 char of str = " + str.charAt(3));

        if (str.equals(str2)) System.out.println("str == str2");
        else System.out.println("str != str2");

        if (str.equals(str3)) System.out.println("str == str3");
        else System.out.println("str != str3");
    }
}
