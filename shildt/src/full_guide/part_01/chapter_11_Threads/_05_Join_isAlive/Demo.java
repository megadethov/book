package full_guide.part_01.chapter_11._05_Join_isAlive;

/**
 * Created by mega on 28.08.2016.
 */
public class Demo {
    public static void main(String[] args) {
        Target target = new Target("One");
        Target target2 = new Target("Two");

        try {
            target.t.join();
            target2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(target.name + " is alive: " + target.t.isAlive());
        System.out.println(target2.name + " is alive: " + target2.t.isAlive());
        System.out.println("main is terminate");

    }
}
