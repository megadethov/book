package ua.mega.lecture4.upper_bounded;

/**
 * Created by Yefremov Yuriy
 */
public class Test {
    public static void main(String[] args) {
//        Bounded<String> ref = new Bounded<>("Hello"); // не компилируется, тк String не является потомком Number
        Bounded<Integer> ref2 = new Bounded<>(100);

    }
}
