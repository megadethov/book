package _34_Recursion;

public class Main {

	public static void main(String[] args) {
		
		// вызов обычного метода
		f(); 

		// вызов рекурсивного метода
		recur(5); // recur(5) -> recur(4) -> recur(3) -> recur(2) -> recur(1)		
	}

	// рекурсивный метод
	public static void recur(int i) {
		System.out.print(i + " ");
		i--;
		if (i > 0)
			recur(i);
	} // end recur()

	// обычный метод
		public static void f() {
			System.out.println("f() start");
			f2();
			System.out.println("f() end");
		}	
	
	// обычный метод
	public static void f2() {
		System.out.println("f2() worked");
	}

}
