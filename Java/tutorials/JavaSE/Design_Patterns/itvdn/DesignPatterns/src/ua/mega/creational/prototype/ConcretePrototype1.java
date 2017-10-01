package ua.mega.creational.prototype;

public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(int id) {
        super(id);
    }

    @Override
    public Prototype cloning() {
        return new ConcretePrototype1(getId());
    }
}
