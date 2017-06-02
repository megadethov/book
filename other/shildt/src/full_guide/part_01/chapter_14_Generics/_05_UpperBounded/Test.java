package full_guide.part_01.chapter_14_Generics._05_UpperBounded;

/**
 * Created by mega on 03.09.2016.
 */
// В этой версии Т должен быть Number или его подклассом.
public class Test {
    public static void main(String[] args) {
        Holder holder = new Holder(new Integer[]{10, 20, 30});
        Holder holder2 = new Holder(new Double[]{10.0, 20.0, 30.0});
//        Holder holder3 = new Holder(new String[]{"AA", "BB"}); // не компилируется

        System.out.println(holder.average());
        System.out.println(holder2.average());

    }
}

class Holder<T extends Number> {
    T[] arr;

    public Holder(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public double average() {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].doubleValue();
        }
        return sum / arr.length;
    }
}
