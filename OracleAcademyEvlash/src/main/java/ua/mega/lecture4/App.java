package ua.mega.lecture4;

import java.util.ArrayList;

/**
 * Created by Yefremov Yuriy
 */
public class App {
    public static void main(String[] args) {
        ArrayList stringList = new ArrayList(); // в сырой ArrayList можно положить все что угодно (приводится к Object)
        stringList.add("Hello");
        stringList.add(25);
        // теперь хочу в цикле посмотреть длину строки, но Object не имеет такого метода - нужно нисходящее приведение вручную
        for (Object ob : stringList) {
            // а как известно down casting на этапе компиляции не валидируется, в рантайме на 2 эл. - ClassCastException
            if (ob instanceof String) // чтобы избежать ClassCastException по Integer ставим условие
                System.out.println(((String) ob).length());
        }

    }
}
