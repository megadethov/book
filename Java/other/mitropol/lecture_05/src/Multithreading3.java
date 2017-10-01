import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;


public class Multithreading3 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 5, 3, 4, 2));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 50, 30, 40, 20));

        List<Integer> result = new ArrayList<>();
//        ReentrantLock reentrantLock = new ReentrantLock(); // вместо lock - synchronized

        Thread t1 = new Thread(() -> {
            Integer max1 = Collections.max(list1, Integer::compare);
            synchronized (result) {
                result.add(max1);
            }
            System.out.println(max1);
        });
        Thread t2 = new Thread(() -> {
            Integer max2 = Collections.max(list2, Integer::compare);
            synchronized (result) {
                result.add(max2);
            }
            System.out.println(max2);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(result);

    }
}
