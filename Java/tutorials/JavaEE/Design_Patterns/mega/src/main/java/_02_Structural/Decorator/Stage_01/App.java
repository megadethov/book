package _02_Structural.Decorator.Stage_01;

public class App {
    public static void main(String[] args) {

        // Обычная версия альбома на CD
        Album album = new AlbumOnCdImpl();
        album.getAlbum();

        System.out.println("===============================");

        // Версия альбома + Bonus track CD
        Album album2 = new AlbumBonusTrackCd(new AlbumOnCdImpl());
        album2.getAlbum();

        System.out.println("===============================");

        // Версия альбома + Bonus track CD + DVD
        Album album3 = new AlbumBonusDVD(new AlbumBonusTrackCd(new AlbumOnCdImpl()));
        album3.getAlbum();
    }
}
