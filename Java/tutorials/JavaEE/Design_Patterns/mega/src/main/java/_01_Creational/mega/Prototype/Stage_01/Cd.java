package _01_Creational.mega.Prototype.Stage_01;

public class Cd implements Copyable {

    private String phonogram;

    public Cd(String phonogram) {
        this.phonogram = phonogram;
    }

    public String getPhonogram() {
        return phonogram;
    }

    public void setPhonogram(String phonogram) {
        this.phonogram = phonogram;
    }

    @Override
    public Object copy() {
        return new Cd(this.phonogram);
    }

    @Override
    public String toString() {
        return "Cd{" +
                "phonogram='" + phonogram + '\'' +
                '}';
    }
}
