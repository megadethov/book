package full_guide.part_01.chapter_06._01_Box;

/**
 * Created by mega on 24.08.2016.
 */
// Рассчитать объем параллелепипеда для 2 объектов
public class BoxTest2 {
    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box();

        box.width = 10;
        box.height = 20;
        box.depth = 30;

        box2.width = 10;
        box2.height = 10;
        box2.depth = 20;


        System.out.println("Объем 1 равен " + (box.width * box.height * box.depth));
        System.out.println("Объем 2 равен " + (box2.width * box2.height * box2.depth));
    }
}
