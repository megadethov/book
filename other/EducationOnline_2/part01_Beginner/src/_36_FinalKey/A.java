package _36_FinalKey;

public class A {
	
	public final String str = "const";    // данное поле изменять низзя	
	
	// этот метод нельзя переопределять он - FINAL
	public final void f() {
		System.out.println("A.f()");
	}
	
	
}
