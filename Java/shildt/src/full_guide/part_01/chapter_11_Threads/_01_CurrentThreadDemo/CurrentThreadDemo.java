package full_guide.part_01.chapter_11._01_CurrentThreadDemo;

/**
 * Created by mega on 28.08.2016.
 */
// Управление главным потоком исполнения
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); // static native
        System.out.println("Current thread: " + t);

        // изменить имя потока исполнения
        t.setName("Target");
        System.out.println("Now current thread: " + t);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print(" " + i);
                Thread.sleep(1000); // static native
            }
        } catch (InterruptedException e) {
            System.out.println(e); // главный поток исполнения прерван
        }
    }
}
