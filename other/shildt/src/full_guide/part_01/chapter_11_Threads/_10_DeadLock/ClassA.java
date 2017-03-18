package full_guide.part_01.chapter_11._10_DeadLock;

/**
 * Created by mega on 29.08.2016.
 */
public class ClassA {
    synchronized void methodA(ClassB classB) {
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        classB.methodB(this);
    }
}
