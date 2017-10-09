package _02_Structural.Bridge.Stage_01;

public class Vinyl extends Media {
    public Vinyl(Band band) {
        super(band);
    }

    @Override
    void unpackMedia() {
        System.out.println("Unpack =VINYL= ...");
    }
}
