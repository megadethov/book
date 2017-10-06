import java.util.Comparator;
import java.util.TreeSet;

public class _01_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>((o1, o2) -> 0);
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set); // 1, тк TreeSet использует только - Comparator, без equals
    }
}
