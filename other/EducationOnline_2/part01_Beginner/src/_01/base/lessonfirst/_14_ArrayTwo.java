package _01.base.lessonfirst;
import java.util.Arrays;

public class _14_ArrayTwo {

	public static void main(String[] args) {
		// 00 01 02 03 04 ..... во внешнем массиве outerArr[0] - лежит массив на
		// [5] элеметов
		// 10 11 12 13 14 ..... во внешнем массиве outerArr[1] - лежит массив на
		// [5] элеметов
		// 20 21 22 23 24 ..... во внешнем массиве outerArr[2] - лежит массив на
		// [5] элеметов
		// 30 31 32 33 34 ..... во внешнем массиве outerArr[3] - лежит массив на
		// [5] элеметов

		int[][] arr = new int[4][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
			} // end inner for
		} // end outer for
		
		// System.out.println(Arrays.toString(arr)); // [[I@2a139a55, [I@15db9742, [I@6d06d69c, [I@7852e922]
		System.out.println(Arrays.deepToString(arr)); // [[0, 1, 2, 3, 4], [1, 2, 3, 4, 5], [2, 3, 4, 5, 6], [3, 4, 5, 6, 7]]
	}

}
