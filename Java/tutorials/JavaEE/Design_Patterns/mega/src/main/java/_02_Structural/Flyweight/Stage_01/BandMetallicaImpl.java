package _02_Structural.Flyweight.Stage_01;

public class BandMetallicaImpl implements Band {
    @Override
    public void play(String track) {
        System.out.println("Metallica - " + track);
    }
}
