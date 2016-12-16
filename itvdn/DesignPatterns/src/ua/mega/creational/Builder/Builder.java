package ua.mega.creational.Builder;

public interface Builder {

    Product getResult();

    void buildRoof();

    void buildFloor();

    void buildBase();
}
