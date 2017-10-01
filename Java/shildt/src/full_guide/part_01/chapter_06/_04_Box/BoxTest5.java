package full_guide.part_01.chapter_06._04_Box;

/**
 * Created by mega on 24.08.2016.
 */
public class BoxTest5 {
    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box();

        box.setDim(1, 2, 3);
        box2.setDim(10, 20, 30);

        System.out.println("Объем 1 равен " + box.volume());
        System.out.println("Объем 2 равен " + box2.volume());
    }
}
