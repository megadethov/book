package ua.mega.creational.prototype;

public abstract class Prototype {
    private int id;

    public Prototype(int id) {
        this.id = id;
    }

    public abstract Prototype cloning();

    public int getId() {
        return id;
    }
}
