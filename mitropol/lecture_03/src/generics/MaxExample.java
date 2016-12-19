package generics;

import java.util.List;

public class MaxExample {
    private static <T extends Comparable<T>> T max(List<T> list) {
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) > max) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }
}
