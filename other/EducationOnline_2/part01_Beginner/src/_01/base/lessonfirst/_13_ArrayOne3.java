package _01.base.lessonfirst;
import java.util.Arrays;

public class _13_ArrayOne3 {

	public static void main(String[] args) {
	
		int[] arr = new int[3];		
		
		// System.out.println(arr); // [I@2a139a55
		// System.out.println(arr.toString()); // [I@2a139a55
		// System.out.println(Arrays.toString(arr)); // [0, 0, 0]
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr)); // [0, 1, 2]

	}

}
