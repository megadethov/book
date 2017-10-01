package _01.base.lessonfirst;

public class _20_Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) continue;       // 0 1 2 3 4 6 7 8 9 
			System.out.print(i + " ");
		}

	}

}
