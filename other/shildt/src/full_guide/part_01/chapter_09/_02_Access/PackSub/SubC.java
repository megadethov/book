package full_guide.part_01.chapter_09._02_Access.PackSub;

import full_guide.part_01.chapter_09._02_Access.packSuper.A;

/**
 * Created by mega on 26.08.2016.
 */
public class SubC {
    void testAccess() {
        A a = new A();
        a.printPublicA();
//        a.printProtectedA(); // invisible
//        a.printPackageA(); // invisible
//        a.printPrivateA(); // invisible
    }
}
