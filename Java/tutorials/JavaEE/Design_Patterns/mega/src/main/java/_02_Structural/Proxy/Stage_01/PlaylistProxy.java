package _02_Structural.Proxy.Stage_01;

public class PlaylistProxy implements Playlist {

    PlaylistImpl playlist = new PlaylistImpl();

    @Override
    public void load() {
        // реальная загрузка начнется после вызова метода play(), а здесь proxy подмена
        System.out.println("Playlist is load (without real tracks.add(), only track list)");
    }

    @Override
    public void play() {
        // здесь уже реальный load
        playlist.load();
        playlist.play();
    }
}
