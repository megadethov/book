package _01_Creational.mega.Factory_Method.Stage_02;

public class App {
    public static void main(String[] args) {
//        CdCreator creator = new CdCreatorMetallicaImpl(); // заменяем утильным методом
        CdCreator creator = selectGroup(Group.METALLICA);
        Cd cd = creator.createCd();

        cd.play();

    }

    // Создадим утильный метод для выбора имплементации CdCreator

    public static CdCreator selectGroup(Group group) {
        CdCreator cdCreator;
        switch (group) {
            case METALLICA:
                cdCreator = new CdCreatorMetallicaImpl();
                break;
            case SLAYER:
                cdCreator = new CdCreatorSlayerImpl();
                break;
                default:
                    throw new RuntimeException("This CD is missing... :(");
        }
        return cdCreator;
    }
}
