package full_guide.part_01.chapter_12._04_Enum_ordinal_compareTo_equals;

/**
 * Created by mega on 29.08.2016.
 */
public enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUN, JULY, AUGUST, SEPTEMBER, OCTOBER,
    NOVEMBER, DECEMBER
}

class Test {
    public static void main(String[] args) {

        for (Months m : Months.values()) {
            System.out.print(" " + m.ordinal());
        }
        Months m0, m1, m2;
        m0 = Months.JANUARY;
        m1 = Months.FEBRUARY;
        m2 = Months.JANUARY;
        System.out.println();

        System.out.println(m0.compareTo(m1)); // -1
        System.out.println(m1.compareTo(m2)); // 1
        System.out.println(m0.compareTo(m2)); // 0


        System.out.println();
        System.out.println(m0.equals(m1)); // false
        System.out.println(m0.equals(m2)); // true
        System.out.println(m0 == m1); // false
        System.out.println(m0 == m2); // true

    }

}
