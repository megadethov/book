import java.util.*;
import java.util.stream.Stream;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Iterator iter = collection.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
//        System.out.println();

        Collection<Integer> unmod = Collections.unmodifiableCollection(collection);
//        unmod.add(100); // java.lang.UnsupportedOperationException

//        Stream<Integer> stream = Stream.generate(() -> 100); // стрим содержащий бесконечное кол-во 100
//        stream.forEach(i -> System.out.println(i)); // the same
//        stream.forEach(System.out::println); // the same
// -------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        Stream<String> s2 = Stream.generate(() -> scanner.nextLine());

//        s2.forEach((i) -> System.out.println("Hello " + i));
//        s2.filter((str) -> str.length() > 3).forEach((i) -> System.out.println("Hello " + i));
//        s2.filter((str) -> str.length() > 3).map(str -> str.toUpperCase()).forEach((i) -> System.out.println("Hello " + i));
//        s2.filter((str) -> str.length() > 3).map(str -> str.length()).forEach((i) -> System.out.println("Hello " + i));
        Stream<Integer> is = s2.filter((str) -> str.length() > 3).map(str -> str.length());
    }
}
