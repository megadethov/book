package full_guide.part_01.chapter_18_Collections._05_TreeSetDemo;

import java.util.TreeSet;

/**
 * Created by mega on 07.09.2016.
 */
// Продемонстрировать применение класса TreeSet
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("G");
        ts.add("D");
        ts.add("B");
        ts.add("F");
        ts.add("A");
        ts.add("E");
        ts.add("C");
        ts.add("C"); // дубли не поддерживает
        System.out.println(ts);
        System.out.println(ts.subSet("B", true, "F", true));
    }
}
