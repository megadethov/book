package ua.mega.lecture1_2;

/**
 * Created by Yefremov Yuriy
 */

// Чем завершится дпнная программа?
//    - напечатает "empty"
//    - напечатает "not empty"
//    - выбросит NullPointerException

public class question2_1 {
    public static void main(String[] args) {
        String s = null;
// длинная проверка & - обязательно проверяет оба условия и во втором случае вызывается метод на null ссылке
        if (s == null | s.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }
}















// NullPointerException