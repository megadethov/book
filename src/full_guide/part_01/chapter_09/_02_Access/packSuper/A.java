package full_guide.part_01.chapter_09._02_Access.packSuper;

/**
 * Created by mega on 26.08.2016.
 */
public class A {
    public void printPublicA() {
        System.out.println("public A");
    }
    protected void printProtectedA() {
        System.out.println("protected A");
    }
    void printPackageA() {
        System.out.println("package A");
    }
    private void printPrivateA() {
        System.out.println("private A");
    }
}
