package full_guide.part_01.chapter_06.chapter_14._08_BoundedWildcard;

/**
 * Created by mega on 04.09.2016.
 */
public class Test {
    public static void main(String[] args) {

        TwoD twoD = new TwoD(10, 20);
        ThreeD threeD = new ThreeD(100, 200, 300);
        FourD fourD = new FourD(1000, 2000, 3000, 4000);

        Holder<TwoD> holder = new Holder<>(new TwoD[]{twoD, threeD, fourD});
        Holder<ThreeD> holder1 = new Holder<>(new ThreeD[]{threeD, fourD});
        Holder<FourD> holder2 = new Holder<>(new FourD[]{fourD, fourD});

        holder.showXY(holder);
//        holder.showXYZ(holder); // компилятор не пропускает TwoD - не входит в Holder<? extends ThreeD>
        holder.showXYZ(holder1); // а теперь пропускает ThreeD - входит в Holder<? extends ThreeD>
//        holder.showXYBottom(holder2); // компилятор не пустит ниже ThreeD
        holder.showXYBottom(holder1); // а теперь работает
    }
}

// Суперкласс с двумя полями x, y
class TwoD {
    int x;
    int y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// наследник TwoD + поле z
class ThreeD extends TwoD {
    int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

// наследник ThreeD + поле t
class FourD extends ThreeD {
    int t;

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

// Обобщенный класс контейнер для хранения массива с координатами
class Holder<T extends TwoD> { // T == TwoD + subclasses
    T[] arr;

    public Holder(T[] arr) {
        this.arr = arr;
    }

    // метод - показывает поля x, y для всех наследников TwoD
// для любого holder(?) T из диапазона <T extends TwoD> вытащить из поля T[] - конкретный class и считать x, y
    public void showXY(Holder<?> holder) {
        for (int i = 0; i < holder.arr.length; i++) {
            // перебрать все значения поля T[] - елементами явл. конкретные классы, взять у каждого поля
            System.out.println("\nXY TwoD top limit: ");
            System.out.print("X, Y: " + holder.arr[i].x + ", " + holder.arr[i].y);
            System.out.println();
        }
    }

    // метод - показывает поля x, yб z для всех наследников ThreeD
    // для этого ограничиваем метасимвол ? сверху классом ThreeD - ВКЛЮЧИТЕЛЬНО !!!!!
    public void showXYZ(Holder<? extends ThreeD> holder) {
        for (int i = 0; i < holder.arr.length; i++) {
            System.out.println("\nXYZ ThreeD top limit:");
            System.out.println("X, Y, Z: " + holder.arr[i].x + ", " + holder.arr[i].y + ", " + holder.arr[i].z);
        }
    }

    // для ограничения снизу (НЕ ВКЛЮЧИТЕЛЬНО???) исп. - super
    public void showXYBottom(Holder<? super ThreeD> holder) { // только для TwoD и выше (выше никого нет)
        for (int i = 0; i < holder.arr.length; i++) {
            System.out.println("\nXY ThreeD bottom limit: ");
            System.out.println("X, Y: " + holder.arr[i].x + ", " + holder.arr[i].y);
        }
    }

}
