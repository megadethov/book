package _34_Recursion;
// This application settings array values with recursion method.
import java.util.Arrays;

public class ArrayRec {

	public static void main(String[] args) {
		
		int k = 20;
		int[] arr = new int[k];	
		setArr(k, arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void setArr(int k, int[] arr) {
		arr[k - 1] = k;
		k--;
		if (k > 0) setArr(k, arr);		
	}

}
