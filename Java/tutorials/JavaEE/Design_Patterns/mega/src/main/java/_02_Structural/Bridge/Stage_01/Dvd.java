package _02_Structural.Bridge.Stage_01;

public class Dvd extends Media {
    public Dvd(Band band) {
        super(band);
    }

    @Override
    void unpackMedia() {
        System.out.println("Unpack =DVD= ...");
    }
}
