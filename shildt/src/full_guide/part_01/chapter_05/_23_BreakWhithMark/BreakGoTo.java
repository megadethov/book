package full_guide.part_01.chapter_05._23_BreakWhithMark;

/**
 * Created by mega on 24.08.2016.
 */
// Применеие break с меткой в кач-ве цивилизованной замены goto
public class BreakGoTo {
    public static void main(String[] args) {
        boolean flag = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператору break");
                    if (flag) break second; // Выход из блока second
                    System.out.printf("Этот оператор не будет выполнен");
                }
                System.out.printf("Этот оператор не будет выполнен");
            }
            System.out.println("Этот оператор следует за блоком second");
        }
    }
}
