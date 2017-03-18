package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("AAA", 100);
        System.out.println(pair.a);
        System.out.println(pair.b);
//        pair.a = "CCC"; // final
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    }
}
