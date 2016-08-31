package full_guide.part_01.chapter_05._03_MissingBreak;

/**
 * Created by mega on 23.08.2016.
 */
// В операторе switch не обязательно указывать break
public class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("val равно 0 - 4");
                    break;
                case 5:
                case 6:
                case 7:
                    System.out.println("val равно 5 - 7");
                    break;
                default:
                    System.out.println("val равно 8 - 11");
                    break;
            }
        }
    }
}
