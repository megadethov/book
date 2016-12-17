package ua.mega.structural.adapter.class_level;

public class Adapter extends Adaptee implements ITarget {

    @Override
    public void request() {
        specificRequest();
    }
}
