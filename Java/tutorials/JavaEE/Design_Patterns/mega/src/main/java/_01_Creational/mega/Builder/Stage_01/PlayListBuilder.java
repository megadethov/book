package _01_Creational.mega.Builder.Stage_01;

public interface PlayListBuilder {

    void addFirstTrackToPlayList();
    void addSecondTrackToPlayList();
    void addThirdTrackToPlayList();

    PlayList getPlayList();
}
