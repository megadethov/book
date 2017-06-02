package full_guide.part_01.chapter_11._07_SynchronizedSection;

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

        synchronized (call) { // секция синхронизации применяется к целому объекту на все его методы
            call.toCall(msg);
        }

    }
}
