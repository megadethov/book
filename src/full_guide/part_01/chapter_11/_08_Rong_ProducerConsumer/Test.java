package full_guide.part_01.chapter_11._08_Rong_ProducerConsumer;

/**
 * Created by mega on 29.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Q q = new Q();
        Consumer consumer = new Consumer(q, "Consumer");
        Producer producer = new Producer(q, "Producer");



    }
}
