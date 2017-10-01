package full_guide.part_01.chapter_11._10_DeadLock;

/**
 * Created by mega on 29.08.2016.
 */
public class OtherThread implements Runnable {
    ClassA classA;
    ClassB classB;
    String name;
    Thread t;

    public OtherThread(ClassA a, ClassB b, String name) {
        classA = a;
        classB = b;
        this.name = name;
        t = new Thread(this, name);
        t.start();
        System.out.println(name + " start");
    }

    @Override
    public void run() {
        System.out.println(name + " invoke methodA");
        classA.methodA(classB);
    }
}
