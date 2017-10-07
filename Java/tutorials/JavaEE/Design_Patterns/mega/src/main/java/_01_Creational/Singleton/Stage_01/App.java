package _01_Creational.Singleton.Stage_01;

public class App {
    public static void main(String[] args) {
        MyLogger myLogger = MyLogger.getMyLogger();
        MyLogger myLogger2 = MyLogger.getMyLogger();
        MyLogger myLogger3 = MyLogger.getMyLogger();
        MyLogger myLogger4 = MyLogger.getMyLogger();

// У всех объектов одинаковый хешкод
        System.out.println(myLogger.hashCode());
        System.out.println(myLogger2.hashCode());
        System.out.println(myLogger3.hashCode());
        System.out.println(myLogger4.hashCode());
// ссылки указывают на один и тот же объект
        System.out.println(myLogger.equals(myLogger2));
        System.out.println(myLogger2.equals(myLogger3));
    }
}
