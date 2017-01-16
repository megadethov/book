package _41_Incapsulation;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.setI(10);
		a.setName("Name");
		
		System.out.println(a.getI());
		System.out.println(a.getName());

	}

}
