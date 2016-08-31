package full_guide.part_01.chapter_08._05_SuperConstructor;

/**
 * Created by mega on 25.08.2016.
 */
// Все конструкторы реализуются через super
public class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    public BoxWeight(Box ob, double weight) {
        super(ob);
        this.weight = weight;
    }

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }
    public BoxWeight() {
        super();
    }
}
