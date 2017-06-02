package _01.base.lessonfirst;
import java.util.Arrays;

public class _15_ArrayThree {

	public static void main(String[] args) {
		
		int[][][] arr = { {{10, 20, 30}, {10, 20, 30}, {10, 20, 30}},
				          {{100, 200, 300}, {100, 200, 300}, {100, 200, 300}},
				          {{1000, 2000, 3000}, {1000, 200, 3000}, {1000, 2000, 3000}}  };
		System.out.println(Arrays.deepToString(arr));	

	}

}
