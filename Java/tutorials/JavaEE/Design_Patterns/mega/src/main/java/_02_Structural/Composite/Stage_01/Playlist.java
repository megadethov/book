package _02_Structural.Composite.Stage_01;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Music {

    private List<Music> tracks = new ArrayList<>();

    public void addTrackOrPlaylist(Music music) {
        tracks.add(music);
    }

    public void removeTrackOrPlaylist(Music music) {
        tracks.remove(music);
    }

    @Override
    public void play() {
        for (Music next : tracks) {
            next.play();
        }
    }
}
