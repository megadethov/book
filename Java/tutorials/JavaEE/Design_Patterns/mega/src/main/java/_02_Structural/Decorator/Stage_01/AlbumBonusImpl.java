package _02_Structural.Decorator.Stage_01;

public abstract class AlbumBonusImpl implements Album {

    private Album album;

    public AlbumBonusImpl(Album album) {
        this.album = album;
    }

    @Override
    public void getAlbum() {
        album.getAlbum();
    }
}
