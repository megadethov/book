package ua.mega.creational.builder;

public interface Builder {

    Product getResult();

    void buildRoof();

    void buildFloor();

    void buildBase();
}
