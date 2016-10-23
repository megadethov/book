package java2.lesson02_DataBase.ex1_junit;

/**
 * Created by mega on 09.09.2016.
 */
public class MyClass {
    int sum(int... i) {
        int sum = 0;
        for (int pointer : i) {
            sum += pointer;
        }
        System.out.println("new feature");
        return sum;
    }
    void printer(String msg) {
        System.out.println(msg);
    }

    void exc() {
//        throw new RuntimeException(); // on off
    }
}
