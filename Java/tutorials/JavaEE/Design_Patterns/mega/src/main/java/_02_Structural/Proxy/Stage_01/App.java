package _02_Structural.Proxy.Stage_01;

public class App {
    public static void main(String[] args) {
        Playlist playlist = new PlaylistProxy();
        playlist.load();
        playlist.play();
    }
}
