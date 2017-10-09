package _01_Creational.Builder.Stage_01;

public class App {
    public static void main(String[] args) {
//        Director director = new Director(new PlayListBuilderThrashImpl());
        Director director = new Director(new PlayListBuilderBlackImpl());
        PlayList playList = director.listenToMusicByStyle();

        playList.showPlayList();
    }
}
