package ua.mega.structural.adapter.object_level;

public class Program {
    public static void main(String[] args) {
        ITarget target = new Adapter();
        target.request();
    }
}
