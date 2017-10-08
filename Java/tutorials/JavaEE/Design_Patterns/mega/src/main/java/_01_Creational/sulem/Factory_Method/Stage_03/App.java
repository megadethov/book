package _01_Creational.sulem.Factory_Method.Stage_03;

// Добавляем утильный метод по выбору фабрики
public class App {
    public static void main(String[] args) {
//        DeveloperFactory factory = new DeveloperFactoryPhpImpl();
        DeveloperFactory factory = selectDeveloperFactory("java");
        Developer developer = factory.getDeveloper();
        developer.writeCode();
    }

    // Util method для выбора типа фабрики
    public static DeveloperFactory selectDeveloperFactory(String type) {
        DeveloperFactory factory;

        switch (type) {
            case "java":
                factory = new DeveloperFactoryJavaImpl();
                break;
            case "php":
                factory = new DeveloperFactoryPhpImpl();
                break;
            default:
                throw new RuntimeException("there is no such factory");
        }
        return factory;
    }
}

