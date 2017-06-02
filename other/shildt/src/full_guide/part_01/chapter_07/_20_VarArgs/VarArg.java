package full_guide.part_01.chapter_07._20_VarArgs;

/**
 * Created by mega on 25.08.2016.
 */
// vararg демонстрация
public class VarArg {
    void print(int... val) {
        for (int i : val) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}

class Demo {
    public static void main(String[] args) {
        VarArg varArg = new VarArg();
        varArg.print();
        varArg.print(1, 2, 3, 4, 5, 6, 7);
        varArg.print(1, 2, 3);
    }
}
