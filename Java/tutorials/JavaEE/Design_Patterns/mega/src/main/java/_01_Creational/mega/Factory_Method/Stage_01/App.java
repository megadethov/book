package _01_Creational.mega.Factory_Method.Stage_01;

public class App {
    public static void main(String[] args) {
        CdCreator creator = new CdCreatorMetallicaImpl();
        Cd cd = creator.createCd();

        cd.play();

    }
}
