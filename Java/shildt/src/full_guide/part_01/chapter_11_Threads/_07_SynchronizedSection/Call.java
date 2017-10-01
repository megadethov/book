package full_guide.part_01.chapter_11._07_SynchronizedSection;

/**
 * Created by mega on 28.08.2016.
 */
public class Call {
    public void toCall(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
