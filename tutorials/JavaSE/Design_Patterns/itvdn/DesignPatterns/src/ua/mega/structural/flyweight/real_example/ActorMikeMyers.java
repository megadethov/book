package ua.mega.structural.flyweight.real_example;

// Разделяемый
public class ActorMikeMyers implements Flyweight {
    @Override
    public void greeting(String speech) {
        System.out.println(speech);
    }
}
