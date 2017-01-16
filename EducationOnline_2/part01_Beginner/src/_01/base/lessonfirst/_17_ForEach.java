package _01.base.lessonfirst;

public class _17_ForEach {

	public static void main(String[] args) {
		// for (объ€вление переменной : массив/коллекци€) {
		//        тело цикла
		//    }
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i: arr) {
			System.out.println(arr[i]);
		}

	}

}
