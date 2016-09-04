package full_guide.part_01.chapter_14._04_WrongBoundedGenerics;

/**
 * Created by mega on 03.09.2016.
 */
// Неудачная попытка создать обобщенный метод только для чисел
public class Test {
    public static void main(String[] args) {

    }
}

class Holder<T> {
    T[] arr;

    public Holder(T[] ref) {
        this.arr = ref;
    }

    public T[] getArr() {
        return arr;
    }

    public double average() {
        double result = 0.0;
        for (int i = 0; i < arr.length; i++) {
//            result += arr[i].doubleValue(); // не компилируется, тк doubleValue() только для Number, а Т - любой
        }
            return result / arr.length;
    }
}
