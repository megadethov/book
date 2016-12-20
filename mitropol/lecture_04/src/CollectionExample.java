import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Iterator iter = collection.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
