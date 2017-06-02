package _36_FinalKey;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		a.f();
		// a.str = " ";  // НИЗЗЯ поле a.str - FINAL
		
		B b = new B();
		b.f();	
		
		final int i = 5;
		// i = 3;   // НИЗЗЯ переменная i - FINAL
		

	}

}
