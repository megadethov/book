package full_guide.part_01.chapter_07._20_VarArgs;

/**
 * Created by mega on 25.08.2016.
 */
public class ArgsAndVarArgs {
    void print(String msg, int... val) {
        System.out.println(msg);
        for (int i : val) {
            System.out.print(" " + i);
        }
    }
}
class Demo2 {
    public static void main(String[] args) {
        ArgsAndVarArgs var = new ArgsAndVarArgs();
        var.print("Content: ", 1, 2, 3, 4, 5);
    }
}
