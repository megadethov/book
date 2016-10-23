package full_guide.part_01.chapter_04._16_ShortLogicalOp;

/**
 * Created by mega on 23.08.2016.
 */
// & - (исп. также с битами) всегда вычисляются оба операнда
// && - условная логическая операция (укороченная) - если первое false, то второе не вычисляется
public class ShortLogicalOp {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b != 0 && a / b > 0) {
//        if (b != 0 & a / b > 0) { // java.lang.ArithmeticException: / by zero
            System.out.println(a / b);
        }
        System.out.println("no exception");
    }
}
