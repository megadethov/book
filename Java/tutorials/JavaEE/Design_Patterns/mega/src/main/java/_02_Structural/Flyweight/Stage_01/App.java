package _02_Structural.Flyweight.Stage_01;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Band> playlist = new ArrayList<>();
        BandFactory factory = new BandFactory();

        playlist.add(factory.getBand("Metallica"));
        playlist.add(factory.getBand("Metallica"));
        playlist.add(factory.getBand("Slayer"));
        playlist.add(factory.getBand("Kreator"));

        for (Band next : playlist) {
            next.play("Track 1");
        }
    }
}
