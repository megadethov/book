package full_guide.part_01.chapter_18_Collections._17_MyComparator_TreeSet;

import java.util.TreeSet;

/**
 * Created by mega on 09.09.2016.
 */
public class Demo {
    public static void main(String[] args) {
//        TreeSet<String> ts = new TreeSet<>(new MyComparator()); // обычный компаратор
        TreeSet<String> ts = new TreeSet<>(new MyComparator().reversed()); // естественный реверс JDK8
        ts.add("F");
        ts.add("C");
        ts.add("G");
        ts.add("D");
        ts.add("H");
        ts.add("E");
        ts.add("B");
        ts.add("A");
        for (String s : ts) {
            System.out.print(s + " ");
        }
    }
}
