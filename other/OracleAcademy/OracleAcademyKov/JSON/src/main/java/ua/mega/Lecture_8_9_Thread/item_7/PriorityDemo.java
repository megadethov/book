package ua.mega.Lecture_8_9_Thread.item_7;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t); // Thread[Thread-0,5,main]

        t.setPriority(9);
        System.out.println(t); // Thread[Thread-0,9,main]
    }
}
