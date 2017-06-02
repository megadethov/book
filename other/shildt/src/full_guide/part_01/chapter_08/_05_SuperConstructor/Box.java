package full_guide.part_01.chapter_08._05_SuperConstructor;

/**
 * Created by mega on 25.08.2016.
 */
// Вызов конструктора суперкласса super()
public class Box {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    public Box (Box ob) { // передать объект конструктору
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }
// конструктор, применяемый при указании всех размеров
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    // конструктор, применяемый при отсутствии размеров
    public Box() {
        this.width = -1; //  -1 обозначает не инициализированные поля
        this.height = -1;
        this.depth = -1;
    }
    // конструктор, применяемый при инициализации куба
    public Box(double len) {
        this.height = this.width = this.depth = len;
    }
   // рассчитать и возвратить объем куба
    double volume() {
        return width * height * depth;
    }

}
