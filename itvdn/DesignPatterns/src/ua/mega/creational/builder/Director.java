package ua.mega.creational.builder;

public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildBase();
        builder.buildFloor();
        builder.buildFloor();
        builder.buildFloor();
        builder.buildFloor();
        builder.buildRoof();
    }
}
