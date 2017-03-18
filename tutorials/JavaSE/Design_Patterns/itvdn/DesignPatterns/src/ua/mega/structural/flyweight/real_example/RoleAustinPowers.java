package ua.mega.structural.flyweight.real_example;

// Неразделяемый
public class RoleAustinPowers implements Flyweight {

    Flyweight flyweight;

    public RoleAustinPowers(Flyweight flyweight) {
        this.flyweight = flyweight;
    }

    @Override
    public void greeting(String speech) {
        this.flyweight.greeting(speech);
    }
}
