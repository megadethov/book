package ua.mega.creational.builder;

public class ConcreteBuilder implements Builder {

    Product product = new Product();

    @Override
    public void buildRoof() {
        product.add("Build Roof");
    }

    @Override
    public void buildFloor() {
        product.add("Build Floor");
    }

    @Override
    public void buildBase() {
        product.add("Build Base");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
