package _01.base.lessonfirst;

public class _13_ArrayOne5 {

	public static void main(String[] args) {
		// Ќайти минимальное значение в массиве

		int arr[] = { 134, 20, 24, 356, 13, 5, 19, 28 };

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}

		System.out.println(min);

	}

}
