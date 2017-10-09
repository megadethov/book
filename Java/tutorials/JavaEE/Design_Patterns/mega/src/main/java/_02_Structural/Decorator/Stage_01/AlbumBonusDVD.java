package _02_Structural.Decorator.Stage_01;

public class AlbumBonusDVD extends AlbumBonusImpl {
    public AlbumBonusDVD(Album album) {
        super(album);
    }

    @Override
    public void getAlbum() {
        super.getAlbum();
        System.out.println(" + Bonus DVD");
    }
}
