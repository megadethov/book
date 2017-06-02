package ua.mega.lecture7.item6_Daemon;

/**
 * Created by Yefremov Yuriy
 */
// если поток должен умереть вместе с основным, его сетят демоном причем до старта
public class TestDaemon {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        Thread.sleep(200);
                        System.out.println(Thread.currentThread().getName() + i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true); // сделали демоном (перд стартом)
        thread.start();

        Thread.sleep(1000); // основной поток спит 1 сек и закрывается, демон должен умереть вместе с ним (прекратить печать в цикле)
    }
}
