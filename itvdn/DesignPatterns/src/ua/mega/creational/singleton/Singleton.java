package ua.mega.creational.singleton;

public class Singleton {

    static Singleton uniqueInstance;
    String singletonData = "";

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
            return uniqueInstance;
        }
        return uniqueInstance;
    }

    public String getSingletonData() {
        return singletonData;
    }

    public void setSingletonData(String singletonData) {
        this.singletonData = singletonData;
    }
}
