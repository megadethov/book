package full_guide.part_01.chapter_08._01_Inheritance;

/**
 * Created by mega on 25.08.2016.
 */
// A расширяет B
public class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("val+j+k = " + (i + j + k));
    }
}
