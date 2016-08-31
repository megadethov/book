package full_guide.part_01.chapter_07._20_VarArgs;

/**
 * Created by mega on 25.08.2016.
 */
// overloading vararg
public class OverloadVarArgs {

    void print(int val) {
        System.out.println("Работает для 1 int" + val);
    }

    void print(int... val) {
        for (int i : val) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    void print(String msg, int... val) {
        System.out.print(msg);
        for (int i : val) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    void print(double... val) {
        for (double d : val) {
            System.out.print(" " + d);
        }
        System.out.println();
    }

    // Неоднозначность
   /* void print(int val, int... val ){
        System.out.println("неоднозначность");
    }*/
}

class TestOverload {
    public static void main(String[] args) {
        OverloadVarArgs over = new OverloadVarArgs();
        over.print(10, 20, 30, 40, 50);
        over.print("Content: ", 100, 200, 300);
        over.print(0.1, 0.2, 0.3, 0.4);
        over.print(1);
    }
}
