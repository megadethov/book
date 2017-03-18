package full_guide.part_01.chapter_07._09_Recursion;

/**
 * Created by mega on 24.08.2016.
 */
public class TestFactorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(1));
        System.out.println(factorial.fact(2));
        System.out.println(factorial.fact(3));
        System.out.println(factorial.fact(4));
        System.out.println(factorial.fact(5));
    }
}
