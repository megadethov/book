package ua.mega.lecture1_2;

/**
 * Created by Yefremov Yuriy
 */

// Чем завершится дпнная программа?
//    - напечатает "empty"
//    - напечатает "not empty"
//    - выбросит NullPointerException

public class question1_3 {
    public static void main(String[] args) {
        String s = null;
// короткая проверка || - достаточно одного условия и во втором случае проверка не происходит
        if (s == null || s.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }
}















// empty