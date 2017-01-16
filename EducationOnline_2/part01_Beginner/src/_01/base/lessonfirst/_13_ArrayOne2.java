package _01.base.lessonfirst;
import java.util.Arrays;

public class _13_ArrayOne2 {

	public static void main(String[] args) {
	
		int[] arr = new int[3];		
		
		// System.out.println(arr); // [I@2a139a55
		// System.out.println(arr.toString()); // [I@2a139a55
		// System.out.println(Arrays.toString(arr)); // [0, 0, 0]
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr)); // [0, 1, 2]
		System.out.println("Sum is: " + sum);

		
	}

}
