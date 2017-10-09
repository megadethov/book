package _02_Structural.Composite;

public class Track implements Music {
    private String name;

    public Track(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Sounds track - " + name);
    }
}
