package _28_Constructor;

public class ConstructorTest {

	public static void main(String[] args) {
		Constructor constructor = new Constructor();
		Constructor constructor2 = new Constructor(3);
		
		constructor2 = null;
		System.gc();         // запуск garbage collector
		
	
	}

}
