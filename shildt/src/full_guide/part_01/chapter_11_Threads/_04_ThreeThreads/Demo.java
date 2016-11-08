package full_guide.part_01.chapter_11._04_ThreeThreads;

/**
 * Created by mega on 28.08.2016.
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println("main start");

        Target thread = new Target("One");
        Target thread2 = new Target("Two");
        Target thread3 = new Target("Three");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("main is terminate");
    }
}
