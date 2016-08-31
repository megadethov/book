package full_guide.part_01.chapter_09._02_Access.PackSub;

import full_guide.part_01.chapter_09._02_Access.packSuper.A;

/**
 * Created by mega on 26.08.2016.
 */
public class SubB extends A {
    void testAccess() {
        this.printPublicA();
        this.printProtectedA();
//        this.printPackageA(); // invisible
//        this.printPrivateA(); // invisible
    }
}
