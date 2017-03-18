package _51_ExceptionIntro;

public class Main {

	public static void main(String[] args) {		

		divide(6, 0);
	}
	
	public static void divide(int a, int b) {
		System.out.println(a / b);  // uncheked
	}

}
