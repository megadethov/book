package full_guide.part_01.chapter_11._06_SynchronizedExample;

/**
 * Created by mega on 28.08.2016.
 */
public class ThreadCaller implements Runnable {
    Call call;
    String msg;
    Thread t;

    public ThreadCaller(Call call, String msg) {
        this.call = call;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }


    @Override
    public void run() {
        call.toCall(msg);
    }
}
