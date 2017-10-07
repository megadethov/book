package ua.mega.creational.prototype;

public class ConcretePrototype2 extends Prototype {

    public ConcretePrototype2(int id) {
        super(id);
    }

    @Override
    public Prototype cloning() {
        return new ConcretePrototype2(getId());
    }
}
