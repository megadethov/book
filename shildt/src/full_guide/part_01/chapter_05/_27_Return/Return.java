package full_guide.part_01.chapter_05._27_Return;

/**
 * Created by mega on 24.08.2016.
 */
public class Return {
    public static void main(String[] args) {
        System.out.println("Before return");
        if(true)
            return;
        System.out.println("After return"); // без if(true) не компилируется - unreachable statement
    }
}
