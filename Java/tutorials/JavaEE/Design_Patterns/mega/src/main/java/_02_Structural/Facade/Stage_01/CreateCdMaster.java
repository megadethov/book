package _02_Structural.Facade.Stage_01;

public class CreateCdMaster {
   private Assembler assembler = new Assembler();
   private Booklet booklet = new Booklet();
   private Cd cd = new Cd();
   private CdCase cdCase = new CdCase();

    public void createNewCdAlbum() {
        cd.makeCd();
        booklet.makeBooklet();
        cdCase.makeCdCase();
        assembler.assembleCd();
    }
}
