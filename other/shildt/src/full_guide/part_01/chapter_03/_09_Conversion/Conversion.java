package full_guide.part_01.chapter_03._09_Conversion;

/**
 * Created by mega on 21.08.2016.
 */
// Продемонстрировать приведение типов
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПреобразование типа int в тип byte.");
        b = (byte) i;
        System.out.println("val и b " + i + " " + b);

        System.out.println("\nПреобразование типа double в тип int");
        i = (int) d;
        System.out.println("d и val " + d + " " + i);

        System.out.println("\nПреобразование типа double в тип byte");
        b = (byte) d;
        System.out.println("d и b " + d + " " + b);

    }
}
