package full_guide.part_01.chapter_11._04_ThreeThreads;

/**
 * Created by mega on 28.08.2016.
 */
public class Target implements Runnable {
    String name;
    Thread t;

    public Target(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("new thread " + t +  " is start");
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " is terminate");
    }
}
