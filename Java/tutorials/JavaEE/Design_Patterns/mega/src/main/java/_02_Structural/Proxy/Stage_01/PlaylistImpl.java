package _02_Structural.Proxy.Stage_01;

import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist {

    private List<String> tracks = new ArrayList<>();

    @Override
    public void load() {
        tracks.add("Track 1");
        tracks.add("Track 2");
        tracks.add("Track 3");
        tracks.add("Track 4");
        System.out.println("Playlist is load");
    }

    @Override
    public void play() {
        System.out.println("Sounds Playlist");
        for (String next : tracks) {
            System.out.println(next);
        }
    }
}
