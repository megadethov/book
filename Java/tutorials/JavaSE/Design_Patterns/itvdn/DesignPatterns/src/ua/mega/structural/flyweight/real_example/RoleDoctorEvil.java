package ua.mega.structural.flyweight.real_example;

// Неразделяемый
public class RoleDoctorEvil implements Flyweight {

    Flyweight flyweight;

    public RoleDoctorEvil(Flyweight flyweight) {
        this.flyweight = flyweight;
    }

    @Override
    public void greeting(String speech) {
        this.flyweight.greeting(speech);
    }
}
