package _02_Structural.Facade.Stage_01;

public class App {
    public static void main(String[] args) {

        // Вариант создания CD без шаблона
/*        Assembler assembler = new Assembler();
        Booklet booklet = new Booklet();
        Cd cd = new Cd();
        CdCase cdCase = new CdCae();

        cd.makeCd();
        booklet.makeBooklet();
        cdCase.makeCdCase();
        assembler.assembleCd();*/

        System.out.println("===============================");

        // Вариант создания CD с шаблоном
        CreateCdMaster master = new CreateCdMaster();
        master.createNewCdAlbum();
    }
}
