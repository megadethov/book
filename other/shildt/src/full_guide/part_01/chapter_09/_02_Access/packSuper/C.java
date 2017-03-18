package full_guide.part_01.chapter_09._02_Access.packSuper;

/**
 * Created by mega on 26.08.2016.
 */
public class C {

    void testAccess() {
        A a = new A();
        a.printPublicA();
        a.printProtectedA();
        a.printPackageA();
//        a.printPrivateA(); // invisible
    }
}
