package ua.mega.lecture7.item4_Join;

public class $App {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            String[] arr = {"One", "Two", "Three", "Four", "Five"};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("BOOM !!!");
        });

        t1.start();
//        t1.join(2000); // wait for me
        t1.join(); // wait for me.
        t2.start();
    }
}


