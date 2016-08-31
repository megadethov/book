package full_guide.part_01.chapter_08._05_SuperConstructor;

/**
 * Created by mega on 25.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        double vol;

        BoxWeight box = new BoxWeight(1, 2, 3, 100.5);
        BoxWeight box2 = new BoxWeight(10, 100.6);
        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(box, 100.7); // пердается объект типа BoxWeight, а вызывается метод Box
        Shipment box5 = new Shipment(12, 112.5, 999.9);

        vol = box.volume();
        System.out.println("box volume = " + vol);
        System.out.println("box weight = " + box.weight);
        System.out.println();

        vol = box2.volume();
        System.out.println("box2 volume = " + vol);
        System.out.println("box2 weight = " + box2.weight);
        System.out.println();

        vol = box3.volume();
        System.out.println("box3 volume = " + vol);
        System.out.println("box3 weight = " + box3.weight);
        System.out.println();

        vol = box4.volume();
        System.out.println("box4 volume = " + vol);
        System.out.println("box4 weight = " + box4.weight);
        System.out.println();

        vol = box5.volume();
        System.out.println("box5 volume = " + vol);
        System.out.println("box5 weight = " + box5.weight);
        System.out.println("box5 cost = " + box5.cost);
        System.out.println();


    }
}
