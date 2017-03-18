package full_guide.part_01.chapter_05._06_NestedSwitch;

/**
 * Created by mega on 23.08.2016.
 */
// Вложенный switch
public class NestedSwitch {
    public static void main(String[] args) {
        int outer = 2;
        int inner = 2;
        switch (outer) {
            case 1:
                break;
            case 2:
                switch (inner) {
                    case 1:
                        break;
                    case 2:
                        System.out.println("Конфликта case внешний-внутренний не существует");
                        break;
                    case 3:
                        break;
                    default:
                }
            case 3:
                break;
            default:
        }
    }
}
