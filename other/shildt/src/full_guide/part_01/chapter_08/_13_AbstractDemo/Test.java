package full_guide.part_01.chapter_08._13_AbstractDemo;

/**
 * Created by mega on 26.08.2016.
 */
// Применение полиморфизма во время исполнения + abstract
public class Test {
    public static void main(String[] args) {
//        Figure figure = new Figure(1, 2); // нельзя создать объект абстрактного класса
        Figure figure2 = new Rectangle(10, 20);
        Figure figure3 = new Triangle(100, 200);

        System.out.println("Rectangle area = " + figure2.area());
        System.out.println("Triangle area = " + figure3.area());
    }
}

