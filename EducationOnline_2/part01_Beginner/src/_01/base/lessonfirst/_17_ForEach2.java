package _01.base.lessonfirst;

public class _17_ForEach2 {

	public static void main(String[] args) {
		// for (объ€вление переменной : массив/коллекци€) {
		//        тело цикла
		//    }
		
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100);
			}		
		}
		
		for (int[] i: arr) {
			for (int j: i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		
		

	}

}
