package ua.mega.lecture2.Practice1.item1_4;

/**
 * Created by Yefremov Yuriy
 */
public class ArrProd {
    public static int prodArr(int[] arr) throws MyException {
        int p = 1;
        if (arr == null) {
            throw new MyException();
        } else if (arr.length == 0 || (arr.length == 1 && arr[0] == 0)) {
            return 0;
        } else {
            for (int i : arr) {
                p = p * i;
            }
        }
        return p;
    }

//    public static void main(String[] args) throws MyException {
//        int[] arr = {10, 20, 30};
//        int i = prodArr(arr);
//        System.out.println(i);
//    }
}
