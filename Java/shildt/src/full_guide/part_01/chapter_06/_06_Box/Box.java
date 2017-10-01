package full_guide.part_01.chapter_06._06_Box;

/**
 * Created by mega on 24.08.2016.
 */
// В этой программе применяется параметризированный конструктор
public class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}
