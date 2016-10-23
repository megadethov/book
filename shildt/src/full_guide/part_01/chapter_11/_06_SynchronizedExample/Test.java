package full_guide.part_01.chapter_11._06_SynchronizedExample;

/**
 * Created by mega on 28.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Call call = new Call();
        ThreadCaller caller1 = new ThreadCaller(call, "ONE");
        ThreadCaller caller2 = new ThreadCaller(call, "TWO");
        ThreadCaller caller3 = new ThreadCaller(call, "THREE");

//        try {
//            caller1.t.join();
//            caller2.t.join();
//            caller3.t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
