package full_guide.part_01.chapter_04._08_MultByTwo;

/**
 * Created by mega on 22.08.2016.
 */
// Применение сдвига влево в качестве быстрого способа умножения на 2
public class MultByTwo {
    public static void main(String[] args) {
        int i ;
        int num = 0xFFFFFFE;

        for (int j = 0; j < 4; j++) {
            num = num << 1;
            System.out.println(num);
        }



    }
}
