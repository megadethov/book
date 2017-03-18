package full_guide.part_01.chapter_11._02_NewThreadRunnable;

/**
 * Created by mega on 28.08.2016.
 */
public class Demo {
    public static void main(String[] args) {
        Target thread = new Target();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main is terminate");
    }
}
