package full_guide.part_01.chapter_11._02_NewThreadRunnable;

/**
 * Created by mega on 28.08.2016.
 */
public class Target implements Runnable {

    Thread t; // ссылка типа Thread

    public Target() {
        // Создать новый, второй поток исполнения
        t = new Thread(this, "run"); // Экземпляру Thread передается в конструкторе Runnable
        System.out.println("run is create " + t);
        t.start(); // стартовать поток run
    }
    // Точка входа в поток Thread #2
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("     run " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("     run is terminate");
    }
}
