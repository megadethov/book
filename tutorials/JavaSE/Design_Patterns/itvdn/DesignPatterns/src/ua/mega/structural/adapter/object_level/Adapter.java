package ua.mega.structural.adapter.object_level;

public class Adapter implements ITarget {

    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
