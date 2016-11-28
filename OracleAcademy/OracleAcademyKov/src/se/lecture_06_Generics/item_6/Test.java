package se.lecture_06_Generics.item_6;

// типизированный метод
// В случаее override, нужно было для каждого типа данных писать свой метод
// C Generics - один метод для всех типов

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // создадим List Integer
        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // создадим List String
        List<String> listString = new ArrayList<>(Arrays.asList("AA", "BB", "CC"));

        // теперь можем вызывать наш типизированный метод как для Integer, так и для String
        Integer i = Utils.fill2(listInteger, 10); // какие параметры дадим такие и будут вместо Т
        String s = Utils.fill2(listString, "zero"); // какие параметры дадим такие и будут вместо Т
//        String str = Utils.fill2(listString, 100); // компилятор следит, чтобы тип List и тип заполняющих значений совпадали

        System.out.println(listInteger);
        System.out.println(listString);
    }


}

class Utils {

    // метод заполняет List Integer элементом типа Integer
    public static Integer fill(List<Integer> list, Integer val) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
        return val;
    }

    // этот метод универсальный - Integer заменяем на <T> - заполняет List типа Т значением типа Т
    // Обязательно перед возвращаемым значением нужно указать, что Т это обобщенный тип - <T>
    public static <T> T fill2(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
        return val;
    }
}
