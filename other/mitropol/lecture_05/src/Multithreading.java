import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 4, 7, 9));
        List<String> list2 = new ArrayList<>(Arrays.asList("ehfg", "jdjhee", "jdejneeke", "dsa"));
// old style =================================================================
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println( Collections.max(list, Integer::compare));
//            }
//        }).start();

// new style==================================================================
        Thread t1 = new Thread(() -> {
            System.out.println(Collections.max((list), Integer::compare));
        });

        Thread t2 = new Thread(() -> {
            System.out.println(Collections.max(list2,
                    (s1, s2) -> (int) s1.chars().filter(c -> c == 'e').count() - (int) s2.chars().filter(c -> c == 'e').count()));
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    } // end main

}
