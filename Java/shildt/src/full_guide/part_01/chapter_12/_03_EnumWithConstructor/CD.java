package full_guide.part_01.chapter_12._03_EnumWithConstructor;

/**
 * Created by mega on 29.08.2016.
 */
public enum CD {
    METALLICA(50), SODOM(60), KORN(70), SEPULTURE(50), PANTERA(55);

    // constructor
    private int price;

    CD(int price) {
        this.price = price;
    }

    // getter
    public int getPrice() {
        return price;
    }
}

class Test {
    public static void main(String[] args) {
        CD[] cd = CD.values();
        for (CD n : cd) {
            System.out.println(n + " " + n.getPrice());
        }
    }
}
