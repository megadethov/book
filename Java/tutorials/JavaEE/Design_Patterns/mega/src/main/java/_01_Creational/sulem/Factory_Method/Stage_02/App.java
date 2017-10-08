package _01_Creational.sulem.Factory_Method.Stage_02;

// Добавляем Фабрику для создания девелоперов
public class App {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactoryPhpImpl();
        Developer developer = factory.getDeveloper();
        developer.writeCode();
    }
}

