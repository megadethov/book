package _01_Creational.mega.Builder.Stage_01;

public class PlayListBuilderBlackImpl implements PlayListBuilder {

    private PlayList playList = new PlayList();

    @Override
    public void addFirstTrackToPlayList() {
        playList.addTrackToPlayList("Dimmu Borgir");
    }

    @Override
    public void addSecondTrackToPlayList() {
        playList.addTrackToPlayList("Satyricon");
    }

    @Override
    public void addThirdTrackToPlayList() {
        playList.addTrackToPlayList("Immortal");
    }

    @Override
    public PlayList getPlayList() {
        return playList;
    }
}
