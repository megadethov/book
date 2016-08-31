package full_guide.part_01.chapter_04._14_RelationalOp;

/**
 * Created by mega on 23.08.2016.
 */
public class RelationalOp {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        boolean c = a > b;
        System.out.println(c);

//        if (!a) System.out.println("not works C++ style");
//        if (a) System.out.println("not works C++ style");
        if (a != 0) System.out.println("it works Java style");
        if (a == 0) System.out.println("it works Java style");
    }
}
