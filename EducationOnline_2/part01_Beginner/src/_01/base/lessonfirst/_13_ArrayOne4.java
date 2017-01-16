package _01.base.lessonfirst;
import java.util.Arrays;

public class _13_ArrayOne4 {

	public static void main(String[] args) {	
				
		// System.out.println(arr); // [I@2a139a55
		// System.out.println(arr.toString()); // [I@2a139a55
		// System.out.println(Arrays.toString(arr)); // [0, 0, 0]
		
		// Посчитать кол-во четных чисел 0...10
		
		// заполняем массив числами 0...10 (11 шт)
		int[] arr = new int[11];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++){
			if ((i % 2) == 0) {
				counter++;
			}
		}
		System.out.println("counter = " + counter);
		
		

	}

}
