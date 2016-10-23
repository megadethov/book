package full_guide.part_01.chapter_11._09_CorrectProducerConsumer;

/**
 * Created by mega on 29.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q, "producer");
        Consumer consumer = new Consumer(q, "consumer");
    }
}
