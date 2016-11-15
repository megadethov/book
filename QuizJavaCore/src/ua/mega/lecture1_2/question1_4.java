package ua.mega.lecture1_2;

/**
 * Created by Yefremov Yuriy
 */

// Чем завершится данная программа?
//    - напечатает "empty"
//    - напечатает "not empty"
//    - выбросит NullPointerException

public class question1_4 {
    public static void main(String[] args) {
        String s = null;
        // короткая проверка && - достаточно не выполнения первого условия и второе условие не проверяется.
        if (s != null && !s.isEmpty()) {
            System.out.println("not empty");
        } else {
            System.out.println("empty");
        }
    }
}















// empty
