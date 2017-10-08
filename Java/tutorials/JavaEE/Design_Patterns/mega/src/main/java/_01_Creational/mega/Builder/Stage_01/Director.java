package _01_Creational.mega.Builder.Stage_01;

public class Director {

    private PlayListBuilder builder;

    public Director(PlayListBuilder builder) {
        this.builder = builder;
    }

    public PlayList listenToMusicByStyle() {
        builder.addFirstTrackToPlayList();
        builder.addSecondTrackToPlayList();
        builder.addThirdTrackToPlayList();
        builder.addThirdTrackToPlayList();
        builder.addThirdTrackToPlayList();

        return builder.getPlayList();
    }
}
