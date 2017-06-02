package java2.lesson01_Generics.ex7;

/**
 * Created by mega on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        String [] strArr = {"one", "two", "three"};
        Integer[] intArr = {23, 47, 2, 48, 1, 104, 6};
        MainCollection<String> collection = new MainCollection<>(strArr); // String - Comparable
        MainCollection<Integer> collection2 = new MainCollection<>(intArr);
        System.out.println(collection.min());
        System.out.println(collection2.min());
    }
}
