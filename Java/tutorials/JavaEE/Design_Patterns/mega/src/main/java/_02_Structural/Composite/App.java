package _02_Structural.Composite;

public class App {
    public static void main(String[] args) {
        Track track1 = new Track("Metallica");
        Track track2 = new Track("Slayer");
        Track track3 = new Track("Sodom");

        Playlist playlist1 = new Playlist();
        playlist1.addTrackOrPlaylist(track1);
        playlist1.addTrackOrPlaylist(track2);

        Playlist playlist2 = new Playlist();
        playlist2.addTrackOrPlaylist(track3);
        playlist2.addTrackOrPlaylist(playlist1);

        playlist2.play();

    }
}
