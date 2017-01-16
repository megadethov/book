package _53_ExceptionFinally;

public class Main {

	public static void main(String[] args) {

		try {
			divide(6, 0);
			System.out.println("It's can not print");
		} catch (ArithmeticException e) {
			System.out.println("/ by 0");
		} catch (IllegalArgumentException e) {
			System.out.println("Wrong arguments");
		} catch (Exception e) {
			System.out.println("Other exception");
		} finally {
			System.out.println("This block always doing");
		}
// в €русных кетчах более общие эксепшин должны быть ниже
	}

	public static void divide(int a, int b) {

		System.out.println(a / b);

	}
}
