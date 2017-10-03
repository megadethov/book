package se.lecture_01_AdvancedClasses.item1_7;

public class $Main {
    public static void main(String[] args) {

        // var 1
        Mappable mappable = new Mappable() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };
        System.out.println(mappable.calc(1, 2));

        // var 2
        mappable = (a, b) -> a + b;
        System.out.println(mappable.calc(1, 2));

    }
}

interface Mappable {
    int calc(int x, int y);
}
