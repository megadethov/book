package ua.mega.Lecture_8_9_Thread.item_6;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        // по умолчанию имя thread = main
        System.out.println(Thread.currentThread()); // Thread[main,5,main]

        // меняем имя
        Thread.currentThread().setName("CurrentThread");
        System.out.println(Thread.currentThread()); // Thread[CurrentThread,5,main]
    }
}
