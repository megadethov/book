package _01_Creational.Factory_Method.Stage_02;

public class App {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactoryJavaImpl();
        Developer developer = factory.getDeveloper();
        developer.writeCode();
    }
}

