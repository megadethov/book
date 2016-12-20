import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPool {
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
        ExecutorService es = Executors.newFixedThreadPool(4); // пул на 4 потока
        List<Future<Integer>> futures = new ArrayList<>();

        for (List l : list) {
            Future<Integer> submit = es.submit(() -> Collections.max(l, Integer::compare)); // Callable аналог Runnable, но имеет return
            futures.add(submit);
        }

        for (Future f : futures) {
            System.out.println(f.get());
        }

        System.exit(0); // нормальное завершение работы программы
    }
}
