package full_guide.part_01.chapter_06._02_Box;

/**
 * Created by mega on 24.08.2016.
 */
// В этой программе вводится метод volume()
public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Объем равен " + width * height * depth);
    }
}
