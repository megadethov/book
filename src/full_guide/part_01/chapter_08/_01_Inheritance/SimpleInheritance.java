package full_guide.part_01.chapter_08._01_Inheritance;

/**
 * Created by mega on 25.08.2016.
 */
public class SimpleInheritance {
    public static void main(String[] args) {
        A classA = new A();
        B classB = new B();

        // суперкласс может использоваться самостоятельно
        classA.i = 10;
        classA.j = 20;
        System.out.println("Содержимое объекта ClassA: ");
        classA.showIJ();
        System.out.println();

        // подкласс имеет доступ ко всем открытым членам суперкласса
        classB.i = 1;
        classB.j = 2;
        classB.k = 3;
        System.out.println("Содержимое объекта classB: ");
        classB.showIJ();
        classB.showK();

        System.out.println();
        System.out.println("Сумма val, j, k в объекте classB: ");
        classB.sum();



    }
}
