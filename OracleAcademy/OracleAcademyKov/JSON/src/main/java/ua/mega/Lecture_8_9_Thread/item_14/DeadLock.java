package ua.mega.Lecture_8_9_Thread.item_14;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
//        Thread.currentThread().join(); // самый короткий deadlock - приджойнился сам к себе
        Counter target = new Counter();
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        t1.start();
        t2.start();
        System.out.println("Waiting for thread ");
        t1.join();
        t2.join();
    }
}

class Counter implements Runnable {

    @Override
    public void run() {
// в этих двух синхронизированых в разном порядке методах - дедлок
        try {
            incrementBallAfterRun();
            incrementBallAfterRun();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void incrementBallAfterRun () throws InterruptedException {
        synchronized (Runs.class) {
            Thread.sleep(100);
            synchronized (Balls.class) {
                Runs.runs++;
                Balls.balls++;
            }
        }
    }
    public void incrementRunAfterDall () {
        synchronized (Balls.class) {
            synchronized (Runs.class) {
                Balls.balls++;
                Runs.runs++;
            }
        }
    }
}


class Balls {
    public static long balls = 0;
}

class Runs {
    public static long runs = 0;
}