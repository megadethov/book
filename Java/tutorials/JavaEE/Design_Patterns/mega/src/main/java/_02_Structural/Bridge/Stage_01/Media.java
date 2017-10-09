package _02_Structural.Bridge.Stage_01;

public abstract class Media {

    public Media(Band band) {
        this.band = band;
    }

    Band band;

    abstract void unpackMedia();
}
