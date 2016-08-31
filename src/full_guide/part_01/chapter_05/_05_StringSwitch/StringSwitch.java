package full_guide.part_01.chapter_05._05_StringSwitch;

/**
 * Created by mega on 23.08.2016.
 */
// Символьные строки в операторе switch (начиная с версии SE7)
public class StringSwitch {
    public static void main(String[] args) {
        String str = "Два";
        switch (str) {
            case "Один":
                System.out.println("Один");
                break;
            case "Два":
                System.out.println("Два");
                break;
            case "Три":
                System.out.println("Три");
                break;
            default:
                System.out.println("Не совпало");

        }
    }
}
