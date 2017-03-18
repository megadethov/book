package ua.mega.lecture2.Junit;

/**
 * Created by Yefremov Yuriy
 */
public class Calculator {
    public static int sum(int... args) {
        int sum=0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }

    public static double sqrt(double i) {
        // первым пишется тест, а затем реализация TDD
//        return 0; //пока метод не реализован, можно поставить заглушку
        return Math.sqrt(i);

    }
}
