package full_guide.part_01.chapter_11._07_SynchronizedSection;

/**
 * Created by mega on 28.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Call call = new Call();
        ThreadCaller caller = new ThreadCaller(call, "ONE");
        ThreadCaller caller2 = new ThreadCaller(call, "TWO");
        ThreadCaller caller3 = new ThreadCaller(call, "THREE");

    }
}
