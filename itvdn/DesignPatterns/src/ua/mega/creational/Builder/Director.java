package ua.mega.creational.Builder;

public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
        System.out.println("Create Director ...");
    }

    public void construct() {

    }
}
