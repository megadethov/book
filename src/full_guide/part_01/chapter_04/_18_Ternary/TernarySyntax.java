package full_guide.part_01.chapter_04._18_Ternary;

/**
 * Created by mega on 23.08.2016.
 */
public class TernarySyntax {
    public static void main(String[] args) {
        int result;
        int a = 10;
        int b = 0;
        result = (b == 0) ? 0 : a / b;
        System.out.println(result);
    }
}
