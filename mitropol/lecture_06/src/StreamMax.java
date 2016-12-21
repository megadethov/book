import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamMax {

  static AtomicInteger atomicInteger = new AtomicInteger(0);
  static int i = 0;

    public static void main(String[] args) {

        Integer integer = Arrays.asList(
                Arrays.asList(1, 87, 3, 4, 99),
                Arrays.asList(1, 2, 28, 4, 5),
                Arrays.asList(1, 38, 3, 4, 5),
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(1, 2, 3, 45, 5),
                Arrays.asList(1, 13, 3, 36, 5)
        ).parallelStream()
                .map(l -> {
                    /*i++;*/
                    System.out.println("count= " + atomicInteger.incrementAndGet());
                    Integer max = Collections.max(l, Integer::compare);
                    /*i--;*/
                    atomicInteger.decrementAndGet();
                    return max;
                }).reduce(Math::max).get();

        System.out.println(integer);
    }
}
