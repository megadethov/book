package se.lecture_01_AdvancedClasses.reference;

/**
 * Created by Yefremov Yuriy
 */
// При передаче примитивного типа - передается копия ее значения
// При передаче ссылочного типв - передается копия ссылки на тот же самый объет
public class Test {
    public static void main(String[] args) {
        int i = 100;
        int[] arr = {1, 2, 3, 4, 5};
        test(i, arr);
        System.out.println(i);
        System.out.println(arr[1]);
    }

    public static void test(int i, int[] arr) {
        i = 10;
        arr[1] = i;
    }
}
