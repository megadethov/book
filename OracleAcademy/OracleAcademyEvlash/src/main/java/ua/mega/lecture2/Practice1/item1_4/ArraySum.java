package ua.mega.lecture2.Practice1.item1_4;

/**
 * <p>
 * класс суммирования элементов массива ArraySum, содержащий статический метод Sum(),
 * принимающий массив в качестве параметра.
 * </p>
 * @author <a href="mailto:mega@ukr.net">Yefremov Yuriy</a>
 * @since 2016-11-16
 */
public class ArraySum {
    /**
     * Запрещаем создание объектов
     */
    private ArraySum() {
    }
    public static int sum(int[] arr) throws MyException {
        if(arr == null){throw new MyException();}
        int s = 0;
        for (int i : arr) {
            s += i;
        }
        return s;
    }


//    public static void main(String[] args) throws MyException {
//        int[] arr = {};
//        System.out.println(arr.length);
//        System.out.println(sum(arr));
//    }
}

