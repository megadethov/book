package _02_Structural.Bridge.Stage_01;

public class App {
    public static void main(String[] args) {
        // Пишем CD Metallica
        Cd cd = new Cd(new BandMetallicaImpl());
        cd.unpackMedia();
        cd.band.play();

        // Пишем Vinyl Metallica
        Vinyl vinyl = new Vinyl(new BandMetallicaImpl());
        vinyl.unpackMedia();
        vinyl.band.play();

        // Пишем DVD Slayer
        Dvd dvd = new Dvd(new BandSlayerImpl());
        dvd.unpackMedia();
        dvd.band.play();
    }
}
