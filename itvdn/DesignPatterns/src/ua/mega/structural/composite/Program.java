package ua.mega.structural.composite;

public class Program {
    public static void main(String[] args) {
        Component root = new Composite("Root");
        Component branch1 = new Composite("Branch 1");
        Component branch2 = new Composite("Branch 2");
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");

        root.add(branch1);
        root.add(branch2);
        branch1.add(leaf1);
        branch2.add(leaf2);

        root.operation();
    }
}
