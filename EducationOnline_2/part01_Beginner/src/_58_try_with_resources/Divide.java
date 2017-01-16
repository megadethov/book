package _58_try_with_resources;


public class Divide implements AutoCloseable {
	
	public void divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
			
			
		}
	}

	@Override
	public void close() {
		System.out.println("resource close");
		
	}
	

}
