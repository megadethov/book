package se.lecture_02_String_StringBuilder_Regexp.item_8;

import java.util.StringTokenizer;

/**
 * Created by Yefremov Yuriy
 */
public class Main {
    public static void main(String[] args) {

        String str = "This string, need to split, \n by spaces and commas"; // есть строка
        StringTokenizer st = new StringTokenizer(str); // создаем StringTokenizer из нашей строки
        System.out.println(str); // вывод исходной строки

        System.out.println("----Split by space----");
        // по StringTokenizer имплементит Enumeration и позволяет пребирать свое содержимое
        // по умолчанию происходит деление на элементы по пробелу (если в конструкторе явно не задан 2-й параметр)
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
        // можно при создании StringTokenizer 2-ым параметром в конструкторе задать делиметр
        System.out.println("----Split by ','-----");
        StringTokenizer st2 = new StringTokenizer(str, ",");

        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }

    }
}
