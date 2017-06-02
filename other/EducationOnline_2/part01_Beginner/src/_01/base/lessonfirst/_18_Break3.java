package _01.base.lessonfirst;

public class _18_Break3 {

	public static void main(String[] args) {
	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) break; // end inner for
				System.out.print(j);
			}
			
			System.out.println(" End loop");
		}

	}

}
