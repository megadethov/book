import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class ParallelStream {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<List<Integer>> list = new ArrayList<>(Arrays.asList(
                Arrays.asList(1, 87, 3, 4, 99),
                Arrays.asList(1, 2, 28, 4, 5),
                Arrays.asList(1, 38, 3, 4, 5),
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(1, 2, 3, 45, 5),
                Arrays.asList(1, 13, 3, 36, 5)
        ));

//        ExecutorService es = new ThreadPoolExecutor(); // для тонкой настройки
//        ExecutorService es = Executors.newFixedThreadPool(4); // пул на 4 потока
        List<Integer> ints = list.parallelStream().map((l) -> Collections.max(l, Integer::compare)).collect(Collectors.toList());
        System.out.println(ints);

        System.exit(0); // нормальное завершение работы программы
    }
}
