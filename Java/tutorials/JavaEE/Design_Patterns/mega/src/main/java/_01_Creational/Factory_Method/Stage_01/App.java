package _01_Creational.Factory_Method.Stage_01;

public class App {
    public static void main(String[] args) {
        Developer developer = new DeveloperPhpImpl();
        developer.writeCode();
    }
}

