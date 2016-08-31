package full_guide.part_01.chapter_11._05_Join_isAlive;

/**
 * Created by mega on 28.08.2016.
 */
public class Target implements Runnable {
    String name;
    Thread t;

    public Target(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println(name + " start");
        t.start();
        System.out.println(name + " is alive: " + t.isAlive());
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(t + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " terminate");

    }
}
