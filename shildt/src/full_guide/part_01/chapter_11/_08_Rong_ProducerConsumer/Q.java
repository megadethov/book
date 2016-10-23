package full_guide.part_01.chapter_11._08_Rong_ProducerConsumer;

/**
 * Created by mega on 29.08.2016.
 */
public class Q {
    int num;

    // получить число num
    synchronized int get() {
        System.out.println("get: " + num);
        return num;
    }
    // положить число num
    synchronized void put(int num) {
        this.num = num;
        System.out.println("put: " + num);
    }
}
