package se.lecture_04_05_Collection.item_10;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        String sentence = "My cat is a little";
        Set<Character> set = new TreeSet<>();
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
        }
        System.out.println(set);
    }
}
