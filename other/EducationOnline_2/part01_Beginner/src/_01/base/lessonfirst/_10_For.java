package _01.base.lessonfirst;

public class _10_For {

	public static void main(String[] args) {

		// for (;;); // бесконечный цикл, если условие не задано по дефолту=
		// true

		// Сумма кратные 3 числа в диапазоне (-100...100)
		int sum = 0;
		for (int i = -100; i <= 100; i++) {
			if ((i % 3) == 0)
				sum += i;
		}
		System.out.println(sum);
	}

}
