package _01.base.lessonfirst;

public class _18_Break4 {

	public static void main(String[] args) {

		label: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3)
					break label; // end OUTER for
				System.out.print(j);
			}

			System.out.println(" End loop");
		}

	}

}
