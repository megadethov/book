package full_guide.part_01.chapter_07._03_OverloadConstructor;

/**
 * Created by mega on 24.08.2016.
 */
// В этой программе применяется перегрузка конструкторов
public class Box {
    double width;
    double height;
    double depth;

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double width) {
        this.width = width;
        height = depth = width;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}
