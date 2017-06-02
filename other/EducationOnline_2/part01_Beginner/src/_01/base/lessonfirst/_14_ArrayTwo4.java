package _01.base.lessonfirst;
import java.util.Arrays;

public class _14_ArrayTwo4 {

	public static void main(String[] args) {
		// найти кол-во значений = 40 и 30
		
		int[][] arr = { {10, 20, 30, 40, 50},
				        {10, 20, 30, 40, 50},
		                {10, 20, 30, 40, 50},
		                {10, 20, 30, 40, 50},
		                {10, 20, 30, 40, 50}  };
		int counter = 0;
		for (int first = 0; first < arr.length; first++) {
			for (int second = 0; second < arr[first].length; second++) {
				if (arr[first][second] == 30 || arr[first][second] == 40) {
					counter++;
				} // end if
			}  // end second for
		} // end first for
		System.out.println("counter = " + counter);
	}
}
