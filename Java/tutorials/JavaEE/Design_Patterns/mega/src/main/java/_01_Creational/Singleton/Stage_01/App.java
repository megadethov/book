package _01_Creational.Singleton.Stage_01;

public class App {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton(); // compile error
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        singleton1.addComment("Comment from singleton1");
        singleton2.addComment("Comment from singleton2");
        Singleton.addComment("Comment static");

        Singleton.showAllComments();

    }
}
