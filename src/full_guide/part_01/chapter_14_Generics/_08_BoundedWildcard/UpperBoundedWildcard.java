package full_guide.part_01.chapter_14_Generics._08_BoundedWildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mega on 04.09.2016.
 */
public class UpperBoundedWildcard {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<>();
        List<? extends Number> list2 = new ArrayList<Integer>();
        List<? extends Number> list3 = new ArrayList<Double>();
//        List<? extends Number> list4 = new ArrayList<Object>(); // не компилиркется Object не extends Number
        Integer i = 10;
//        list.add(i);
//        list2.add(i);

        list = list2;
        list = list3;
    }
}
