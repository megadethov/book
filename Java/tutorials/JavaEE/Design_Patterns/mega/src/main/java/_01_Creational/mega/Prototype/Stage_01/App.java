package _01_Creational.mega.Prototype.Stage_01;

public class App {
    public static void main(String[] args) {
        Cd cd = new Cd("Metellica");
        System.out.println(cd);

        Cd copyCd = (Cd) cd.copy();
        System.out.println(copyCd);

        cd.setPhonogram("Slayer");
        System.out.println(cd);
        System.out.println(copyCd);

    }
}
