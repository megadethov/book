package _01.base.lessonfirst;
import java.util.Arrays;

public class _14_ArrayTwo3 {

	public static void main(String[] args) {
		// написать таблицу умножения 1...9 * 1....9 КАК В ТЕТРАДКЕ !!!!

		int arr[][] = new int[10][10]; // create array
		for (int first = 1; first < arr.length; first++) {
			for (int second = 1; second < arr[first].length; second++) {
				arr[second][first] = first * second;
				System.out.printf("%2d  * %2d = %2d      ", first, second, first * second);
			} // end second for
			System.out.println();
		} // end first for

	}
}
