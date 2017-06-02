package se.lecture_04_05_Collection.item_7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // создадим коллекцию Rectangle и отсортируем их по площади
        List<Rectangle> ls = new ArrayList<>(Arrays.asList(new Rectangle(10, 20), new Rectangle(1, 2), new Rectangle(100, 200)));
        System.out.println(ls);
        Collections.sort(ls, new ComparatorByArea());
        System.out.println(ls);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        // создадим коллекцию Rectangle и отсортируем их по площади
        Rectangle[] arr = {new Rectangle(10, 20), new Rectangle(1, 2), new Rectangle(100, 200)};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new ComparatorByArea());
        System.out.println(Arrays.toString(arr));
    }
}

class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "[" + this.area() + "] ";
    }
}
// создаем Comparator
class ComparatorByArea implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return Double.compare(o1.area(), o2.area()); // делегируем Double.compare()
    }
}