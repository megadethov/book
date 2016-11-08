package full_guide.part_01.chapter_11._06_SynchronizedExample;

/**
 * Created by mega on 28.08.2016.
 */
// Эта программа не синхронизирована
public class Call {
    public /*synchronized*/ void toCall(String msg){ // synchronized запрещает одновременный доступ потоков
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
