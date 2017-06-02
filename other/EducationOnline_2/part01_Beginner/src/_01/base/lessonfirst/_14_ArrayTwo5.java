package _01.base.lessonfirst;
import java.util.Arrays;

public class _14_ArrayTwo5 {

	public static void main(String[] args) {
		// найти сумму чисел главной диагонали матрицы
		
		int[][] arr = { {10, 20, 30, 40, 50},
				        {10, 20, 30, 40, 50},
		                {10, 20, 30, 40, 50},
		                {10, 20, 30, 40, 50},
		                {10, 20, 30, 40, 50}  };
		int sum = 0;
		for (int first = 0; first < arr.length; first++) {
			for (int second = 0; second < arr[first].length; second++) {
				if (first == second) sum += arr[first][second];
			} // end first for
		} // end first for
System.out.println(sum);
	}
}
