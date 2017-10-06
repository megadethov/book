import java.util.NavigableSet;
import java.util.TreeSet;

public class _02_NavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }

        System.out.println(set.headSet(3)); // 1, 2
        System.out.println(set.headSet(3, true)); // 1, 2, 3
        System.out.println(set.tailSet(3, true)); // 3, 4, 5, 6, 7, 8, 9, 10
        System.out.println(set.descendingSet()); // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        System.out.println(set.lower(3)); // 2
        System.out.println(set.higher(3)); // 4


    }
}
