package _01_Creational.mega.Builder.Stage_01;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private List<String> listTracks = new ArrayList<>();

    public void addTrackToPlayList(String track) {
        listTracks.add(track);
    }

    protected void showPlayList() {
        for (String next : listTracks) {
            System.out.println(next);
        }
    }
}
