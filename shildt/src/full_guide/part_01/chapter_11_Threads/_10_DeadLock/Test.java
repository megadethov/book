package full_guide.part_01.chapter_11._10_DeadLock;

/**
 * Created by mega on 29.08.2016.
 */

// Есть два класса у каждого по синхро методу. В этих методах идет вызов друг друга.
    // Каждый метод запускается в другом потоке. Результат - залоченый метод из одного потока пытается
    // вызвать залоченный метод из другого потока. Последний делает то же самое - deadlock.
public class Test {
    public static void main(String[] args) {
        System.out.println("Main is start");
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        OtherThread otherThread = new OtherThread(classA, classB, "Other thread");

       classB.methodB(classA);

    }
}
