package full_guide.part_01.chapter_11._03_NewThreadsExtends;

/**
 * Created by mega on 28.08.2016.
 */
public class NewThread extends Thread {
    NewThread() {
        super("run"); // вызов конструктора суперкласса Thread
        System.out.println("     run start");
        start(); // метод Thread.start() запускает run() - точка входа в новый поток
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("     run " + i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("     run is terminate");
    }
}
