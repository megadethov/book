package full_guide.part_01.chapter_08._05_SuperConstructor;

/**
 * Created by mega on 25.08.2016.
 */
class Shipment extends BoxWeight {
    double cost;
    public Shipment(double length, double weight, double cost) {
        super(length, weight);
        this.cost = cost;
    }
}
