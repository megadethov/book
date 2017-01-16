package _39_InitialBlocks;

public class A {
	private String name;
	private static int s;
	
	// Блоки инициализации идут перед конструкторами (обычные и статики) Статики всегда вып. первыми
	// Позволяют Инициализировать поля
	
	{
		name = "IB-1";
		System.out.println("initial block-1 worked");
	}
	/*static*/ {
		s = 5;
		System.out.println("initial block-2 worked");
	}

	// constructor 1
	public A() {
		System.out.println("constructor 1 worked");
	}

	// constructor 2
	public A(String name) {
		this.name = name;
		System.out.println("constructor 2 worked");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getS() {
		return s;
	}

	public static void setS(int s) {
		A.s = s;
	}

	
	
	

}
