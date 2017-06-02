package full_guide.part_01.chapter_14_Generics._08_BoundedWildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mega on 04.09.2016.
 */
// Lower bound wildcard
// Важно обобщается типдсамого List, а не добавляемые в него значения.
public class LowerBoundedWildcard {
    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<Integer>();
        List<? super Integer> list2 = new ArrayList<Number>();
        List<? super Integer> list3 = new ArrayList<Object>();
//        List<? super Integer> list4 = new ArrayList<Double>(); // не компилируется Double не явл. super для Integer

        Integer i = 10;

        list.add(i);
        list2.add(i);
        list3.add(i);

        list = list2;
        list = list3;
    }
}
