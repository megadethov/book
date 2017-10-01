package _52_ExceptionHandling;

public class Main2 {

	public static void main(String[] args) {

		try {
			divide(6, 0);
			System.out.println("It's can not print");
		} catch (ArithmeticException e) {
			System.out.println("/ by 0");
			// e.printStackTrace();
			// e.getMessage();
		}
		
	}

	public static void divide(int a, int b) {
		
		System.out.println(a / b);

	}
}
