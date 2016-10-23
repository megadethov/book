package full_guide.part_01.chapter_05._01_IfElse;

/**
 * Created by mega on 23.08.2016.
 */
public class IfElse {
    public static void main(String[] args) {
        int month = 4; // Апрель
        String season;
        if (month == 0 || month == 1 || month == 2) {
            season = "зиме";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "весне";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "лету";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "осени";
        } else {
            season = "вымышленному месяцу";
        }

        System.out.println("Сезон соответствует: " + season);
    }
}
