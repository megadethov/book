package _01_Creational.Factory_Method.Stage_04;

// Добавляем утильный метод по выбору фабрики + Enum
public class App {
    public static void main(String[] args) {
//        DeveloperFactory factory = new DeveloperFactoryPhpImpl();
        DeveloperFactory factory = selectDeveloperFactory(FactoryType.JAVA);
        Developer developer = factory.getDeveloper();
        developer.writeCode();
    }

    // Util method для выбора типа фабрики
    public static DeveloperFactory selectDeveloperFactory(FactoryType type) {
        DeveloperFactory factory;

        switch (type) {
            case JAVA:
                factory = new DeveloperFactoryJavaImpl();
                break;
            case PHP:
                factory = new DeveloperFactoryPhpImpl();
                break;
            default:
                throw new RuntimeException("there is no such factory");
        }
        return factory;
    }
}

