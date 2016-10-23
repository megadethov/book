package full_guide.part_01.chapter_14_Generics._07_Wildcard;

/**
 * Created by mega on 03.09.2016.
 */
public class Test {
    public static void main(String[] args) {

        Holder<Integer> holder = new Holder<>(new Integer[]{10, 20, 30});
        Holder<Double> holder2 = new Holder<>(new Double[]{10.0, 20.0, 30.0});
        Holder<Double> holder3 = new Holder<>(new Double[]{10.0, 20.0, 30.0});

        double averageRes = holder.average();
        System.out.println(averageRes);
        double average2Res = holder2.average();
        System.out.println(average2Res);
        double average3Res = holder3.average();
        System.out.println(average2Res);

        // equalsAverage сработает только для 2 типов Т, например Double и Double
//        if (holder.equalsAverage(holder2)) System.out.println("averageRes = average2Res");
        // а так сработает для Double и Double, но это не совсем обощенный тип
        if (holder2.equalsAverage(holder3)) System.out.println("average2Res = average3Res");
        else System.out.println("average2Res != average3Res");

        // метод equalsAverage2 исп. метасимвол <?>, к-ый позволяет сравнивать Double с Integer
        if (holder.equalsAverage2(holder2)) System.out.println("averageRes = average2Res");
        else System.out.println("average2Res != average2Res");
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
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].doubleValue();
        }
        return sum / arr.length;
    }

    // в этом методе проверяются на равенство средние значения двух массивов
    public boolean equalsAverage(Holder<T> other) { // не работает
        if (this.average() == other.average()) return true;
        else return false;
    }

    public boolean equalsAverage2(Holder<?> other) { // метасимвол ? - тип не определен, те любой из <T extends Number>
        if (this.average() == other.average()) return true;
        else return false;
    }
}
