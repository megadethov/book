import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Iterator iter = collection.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

      Collection<Integer> unmod = Collections.unmodifiableCollection(collection);
        unmod.add(100); // java.lang.UnsupportedOperationException
    }
}
