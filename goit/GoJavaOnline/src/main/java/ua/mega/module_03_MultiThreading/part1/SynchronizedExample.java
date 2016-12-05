package ua.mega.module_03_MultiThreading.part1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SynchronizedExample {

    public int counter;
//    public final Object lock = new Object(); // всегда final

    public static void main(String[] args) throws InterruptedException {
        new SynchronizedExample().test();
    }

    public synchronized int increment() {
            return counter++;
    }

    public void test() throws InterruptedException {
        List<Aggregator> aggregators = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Aggregator aggregator = new Aggregator();
            aggregators.add(aggregator);
            new Thread(aggregator).start();
        }

        Thread.sleep(100);

        boolean isValid = true;

        Set<Integer> integerSet = new HashSet<>();
        for (Aggregator aggregator : aggregators) {
            for (Integer i : aggregator.ints) {
                if (!integerSet.add(i)) {
                    System.out.println("Error! Duplicate found: " + i);
                    isValid = false;
                }

            }
        }
        if (isValid)
        System.out.println("No duplicates");
    }


    public class Aggregator implements Runnable {
        List<Integer> ints = new ArrayList<>();

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                ints.add(increment());
            }

        }
    }
}
