package _01.base.lessonfirst;

public class _10_For2 {

	public static void main(String[] args) {
		
		//for (;;); // бесконечный цикл, если условие не задано по дефолту= true
		
		// кратные 3 числа в диапазоне (-100...100)
		for (int i = -100; i <= 100; i++) {
			if ((i % 3) == 0) System.out.print(i + " ");				
		}
	}

}
