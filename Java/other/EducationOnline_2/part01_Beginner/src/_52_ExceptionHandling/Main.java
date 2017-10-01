package _52_ExceptionHandling;

public class Main {

	public static void main(String[] args) {		

		divide(6, 0);
	}
	
	// этот метод НУЖНО/МОЖНО обр. тк он несет потенциальную ошибку  /0
	// (/0) java.lang.ArithmeticException является RuntimeException uncheked - не обязательно обр.
	public static void divide(int a, int b) {
		System.out.println(a / b);  // uncheked
	}
	
	// этот метод можно не обр. тк он не несет никакой потенциальной ошибки
	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

}
