package _58_try_with_resources;

public class Main {

	public static void main(String[] args) {
		
		try (Divide d = new Divide();) {
			
			d.divide(10, 0);			
		}

	}

}
