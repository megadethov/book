package full_guide.part_01.chapter_08._02_InheritanceAccessErr;

/**
 * Created by mega on 25.08.2016.
 */
// j недоступна для подкласса
public class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
//        System.out.println("val+j+k = " + (val + j + k)); // j has private access
    }
}
