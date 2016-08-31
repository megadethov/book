package full_guide.part_01.chapter_09._02_Access.packSuper;

/**
 * Created by mega on 26.08.2016.
 */
public class B extends A {
    void testAccess() {
        this.printPublicA();
        this.printProtectedA();
        this.printPackageA();
//        this.printPrivateA(); // invisible
    }
}
