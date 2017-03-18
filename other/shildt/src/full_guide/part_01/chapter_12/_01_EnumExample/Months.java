package full_guide.part_01.chapter_12._01_EnumExample;

/**
 * Created by mega on 29.08.2016.
 */
public enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUN, JULY, AUGUST, SEPTEMBER, OCTOBER,
    NOVEMBER, DECEMBER
}

class Test {
    public static void main(String[] args) {
        // переменная типа Months
        Months month = Months.APRIL;
        System.out.println(month);

        // сравнение
        if (month == Months.APRIL) System.out.println("month has APRIL");

        // switch with Enum
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("Winter");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Spring");
                break;
            case JUN:
            case JULY:
            case AUGUST:
                System.out.println("Summer");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Incorrect");
        }
    }
}
