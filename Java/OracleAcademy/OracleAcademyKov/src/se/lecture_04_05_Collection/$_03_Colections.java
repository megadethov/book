package se.lecture_04_05_Collection;

import java.util.*;

public class $_03_Colections {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("AAA", "ZZZ", "FFF", "BBB"); // immutable
        List<String> list = new ArrayList<>(Arrays.asList("AAA", "ZZZ", "FFF", "BBB"));
        list.add("CCC");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
