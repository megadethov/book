package _01_Creational.sulem.Singleton.Stage_01;

public class MyLogger {
    private static MyLogger LOG;

    private MyLogger() {
    }

    public static MyLogger getMyLogger() {
        if (LOG == null) {
            LOG = new MyLogger();
        }
        return LOG;
    }

}
