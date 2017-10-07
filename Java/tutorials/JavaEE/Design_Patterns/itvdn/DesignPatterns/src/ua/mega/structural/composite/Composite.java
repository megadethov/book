package ua.mega.structural.composite;

import java.util.ArrayList;

public class Composite extends Component {
    ArrayList<Component> nodes = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(getName());
        for (Component component : nodes) {
            component.operation();
        }
    }

    @Override
    public void add(Component component) {
        nodes.add(component);
    }

    @Override
    public void remove(Component component) {
        nodes.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return nodes.get(index);
    }
}
