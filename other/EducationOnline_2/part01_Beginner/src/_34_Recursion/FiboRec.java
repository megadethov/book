package _34_Recursion;
// 1 1 2 3 5 8 13

public class FiboRec {

	
	public static void main(String[] args) {
		System.out.println(fiboRec(6));
		// f(5)
	}
	
	// ф-ция принимает порядковый номер элемента в ряду Фибо и возвращает его значение
	public static int fiboRec(int i) {	
		if (i == 0) return 0;
		if (i == 1) return 1;		
		
		return fiboRec(i-1) + fiboRec(i-2);
		
	}

}
