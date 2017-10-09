package _02_Structural.Decorator.Stage_01;

public class AlbumBonusTrackCd extends AlbumBonusImpl {
    public AlbumBonusTrackCd(Album album) {
        super(album);
    }

    @Override
    public void getAlbum() {
        super.getAlbum();
        System.out.println(" + Bonus Track CD");
    }
}
