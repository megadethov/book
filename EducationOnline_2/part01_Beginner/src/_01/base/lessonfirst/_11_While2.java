package _01.base.lessonfirst;

public class _11_While2 {

	public static void main(String[] args) {
		
		// while (true); // бесконечный цикл
		
		// кратные 3 числа в диапазоне (-100...100)
		int sum = 0;
		int i = -100;
		while (i <= 100) {
			if ((i % 3) == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("Sum is: " + sum);

	}

}
