package full_guide.part_01.chapter_18_Collections._18_LambdaComparator;

import java.util.TreeSet;

/**
 * Created by mega on 09.09.2016.
 */
// Использование лямбда выражений для создания компаратора с обратным упорядочением.
public class LambdaComparator {
    public static void main(String[] args) {
        // При создании TreeSet ему передается компаратор
        TreeSet<String> ts = new TreeSet<>((obj1, obj2) -> obj2.compareTo(obj1));
        ts.add("A");
        ts.add("C");
        ts.add("F");
        ts.add("E");
        ts.add("B");
        ts.add("D");
//        System.out.println(ts);
        for (String s : ts) {
            System.out.print(s + " ");
        }
    }

}
