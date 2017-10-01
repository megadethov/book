package ua.mega.lecture4;

import java.util.ArrayList;

/**
 * Created by Yefremov Yuriy
 */
public class App2 {
    public static void main(String[] args) {
        // ArrayList уже является обобщенным типом (сырые типы оставили для обратной совместимости)
        // Подставим ему в тип - String и теперь он может работать только с ним.
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
//        stringList.add(25); // теперь мы уже компилятор не разрешит такую операцию и ошибка не дойдет до рантайма
        for (Object ob : stringList) { // в коллекции лежит то, что положили, без up cast до Object
//            if (ob instanceof String) // необходтмость проверки отпадает
                System.out.println(((String) ob).length()); // необходимость down cast отпадает
        }

    }
}
