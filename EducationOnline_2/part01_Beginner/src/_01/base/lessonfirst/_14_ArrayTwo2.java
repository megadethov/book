package _01.base.lessonfirst;
import java.util.Arrays;

public class _14_ArrayTwo2 {

	public static void main(String[] args) {
		// написать таблицу умножения 1...9 * 1....9

		int arr[][] = new int[10][10]; // create array 
		for (int first = 1; first < arr.length; first++) {
			for (int second = 1; second < arr[first].length; second++) {
				arr[first][second] = first * second;
				System.out.printf("%d * %d = %d\n", first, second, first * second);
			} // end second for
			System.out.println();
		} // end first for

	}
}
