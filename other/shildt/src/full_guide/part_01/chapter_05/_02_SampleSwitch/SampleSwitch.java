package full_guide.part_01.chapter_05._02_SampleSwitch;

/**
 * Created by mega on 23.08.2016.
 */
// Простой пример применения оператора switch
public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("val = 0");
                    break;
                case 1:
                    System.out.println("val = 1");
                    break;
                case 2:
                    System.out.println("val = 2");
                    break;
                case 3:
                    System.out.println("val = 3");
                    break;
                default:
                    System.out.println("val > 3");
            }

        }
    }
}
