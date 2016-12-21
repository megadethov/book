import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Executor {

    static ExecutorService executor = Executors.newFixedThreadPool(2); // пул на 2 потока

    static Integer max(List<Integer> l) throws ExecutionException, InterruptedException {
        int size = l.size();
        List<Integer> subList1 = l.subList(0, size / 2);
        List<Integer> sublist2 = l.subList(size / 2, size);

        Future<Integer> f1 = executor.submit(
                () -> Collections.max(subList1, Integer::compare));
        Future<Integer> f2 = executor.submit(
                () -> Collections.max(sublist2, Integer::compare));

        return f1.get() > f2.get() ? f1.get() : f2.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // TODO: ForkJoin

       /* List<List<Integer>> list = new ArrayList<>(Arrays.asList(
                Arrays.asList(1, 87, 3, 4, 99),
                Arrays.asList(1, 2, 28, 4, 5),
                Arrays.asList(1, 38, 3, 4, 5),
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(1, 2, 3, 45, 5),
                Arrays.asList(1, 13, 3, 36, 5)
        )).stream().map(l -> executor.submit(() -> max(l))).collect(Collectors.toList());
*/
        System.exit(0); // нормальное завершение работы программы
    }
}
