package full_guide.part_01.chapter_05._04_Switch;

/**
 * Created by mega on 23.08.2016.
 */
// Усовершенствованная программа о сезонах
public class Switch {
    public static void main(String[] args) {
        int month = 12;
        String season;
        switch (month) {
            case 0:
            case 1:
            case 2:
                season = "зиме";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "лету";
                break;
            case 9:
            case 10:
            case 11:
                season = "осени";
                break;
            default:
                season = "вымышленному месяцу";
        }
        System.out.println("Сезон соответствует " + season);
    }
}
