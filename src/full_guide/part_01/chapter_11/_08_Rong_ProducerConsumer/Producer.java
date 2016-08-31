package full_guide.part_01.chapter_11._08_Rong_ProducerConsumer;

/**
 * Created by mega on 29.08.2016.
 */
public class Producer implements Runnable {
    String name;
    Q q;
    Thread t;

    public Producer(Q q, String name) {
        this.q = q;
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        int counter = 20;
        while (counter-- > 0) {
            q.put(i++);
        }
    }
}
