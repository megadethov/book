package ua.mega.structural.composite;

public abstract class Component {

    private String name;

    public String getName() {
        return name;
    }

    public Component(String name) {
        this.name = name;
    }

    public abstract void operation();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int index);
}
