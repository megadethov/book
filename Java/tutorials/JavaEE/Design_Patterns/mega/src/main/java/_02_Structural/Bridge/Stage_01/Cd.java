package _02_Structural.Bridge.Stage_01;

public class Cd extends Media {

    public Cd(Band band) {
        super(band);
    }

    @Override
    void unpackMedia() {
        System.out.println("Unpack =CD= ...");
    }
}
