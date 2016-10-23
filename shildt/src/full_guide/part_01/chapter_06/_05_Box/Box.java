package full_guide.part_01.chapter_06._05_Box;

/**
 * Created by mega on 24.08.2016.
 */
// В этой программе применяется конструктор для инициализации всех полей
public class Box {
    double width;
    double height;
    double depth;

    public Box() {
        this.width = 10;
        this.height = 20;
        this.depth = 30;
    }

    double volume() {
        return width * height * depth;
    }
}
