package _02_Structural.Flyweight.Stage_01;

public class BandKreatorImpl implements Band {
    @Override
    public void play(String track) {
        System.out.println("Kreator - " + track);
    }
}
