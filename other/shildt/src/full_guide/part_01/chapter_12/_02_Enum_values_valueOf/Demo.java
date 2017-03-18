package full_guide.part_01.chapter_12._02_Enum_values_valueOf;

/**
 * Created by mega on 29.08.2016.
 */
enum Numbers {
    ONE, TWO, THREE, FOUR, FIVE
}

public class Demo {
    public static void main(String[] args) {
        Numbers[] num = Numbers.values();
        for (Numbers n : num) {
            System.out.println(n);
        }

        Numbers number = Numbers.valueOf("FIVE");
        System.out.println();
        System.out.println(number);
    }

}
