package full_guide.part_01.chapter_11._03_NewThreadsExtends;

/**
 * Created by mega on 28.08.2016.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("main is start");
        NewThread thread = new NewThread(); // новый поток

        for (int i = 0; i < 5; i++) {
            System.out.println("main " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main is terminate");
    }
}
