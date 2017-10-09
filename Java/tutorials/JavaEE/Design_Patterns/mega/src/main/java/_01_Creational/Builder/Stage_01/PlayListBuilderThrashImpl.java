package _01_Creational.Builder.Stage_01;

public class PlayListBuilderThrashImpl implements PlayListBuilder {

    private PlayList playList = new PlayList();

    @Override
    public void addFirstTrackToPlayList() {
        playList.addTrackToPlayList("Slayer");
    }

    @Override
    public void addSecondTrackToPlayList() {
        playList.addTrackToPlayList("Kreator");
    }

    @Override
    public void addThirdTrackToPlayList() {
        playList.addTrackToPlayList("Anthrax");
    }

    @Override
    public PlayList getPlayList() {
        return playList;
    }
}
