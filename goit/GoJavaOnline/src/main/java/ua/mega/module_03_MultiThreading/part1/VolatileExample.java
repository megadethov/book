package ua.mega.module_03_MultiThreading.part1;

public class VolatileExample {

    private /*volatile*/ static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Worker()).start();
        Thread.sleep(100);
        flag = false;
        System.out.println(flag);
    }



    public static class Worker implements Runnable {

        @Override
        public void run() {
            int i = 0;
            while (flag) { // здесь срабатывает оптимизация - значение flag=true кешируется и цикл висит (нужно сделать volatile flag)
                i++;
            }
            System.out.println(i);
        }
    }
}
