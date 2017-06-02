package ua.mega.lecture7.item4_Join;

/**
 * Created by Yefremov Yuriy
 */

// сначала завершится main, а run еще будет работать
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        sleep(300);
                        System.out.println(getName() + " " + i);
                        if (i == 6) throw new Error("Пришел минер"); // здесь run помер, а main продолжает свою работу
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();

        // если мы хотим, чтобы main завершился последним, нужно из main приджойниться к run и тогда main не завершит
        // свою работу пока работает run
        thread.join();

        // можно приджойниться на заданное время
//        thread.join(2000);

        System.out.println("Boom " + Thread.currentThread().getName());
    }
}
