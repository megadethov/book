package ua.mega.Lecture_8_9_Thread.item_9;

public class ThreadTime extends Thread {
    String[] arr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    @Override
    public void run() {
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(arr[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadTime timer = new ThreadTime();
        timer.start();

        try {
            timer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("BABAAAHHH!!!");

    }
}
