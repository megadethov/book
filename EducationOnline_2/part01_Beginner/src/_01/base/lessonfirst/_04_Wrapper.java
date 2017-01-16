package _01.base.lessonfirst;

public class _04_Wrapper {

	public static void main(String[] args) {
		String str1 = "10";
		String str2 = "20";
		String str3 = str1 + str2;
		System.out.println(str3);
		
		// java.lang
		// Integer
		// Long
		// Short
		// Byte
		// Double
		// Float
		// Character
		// Boolean
		
		Integer myInt = 90;
		System.out.println(myInt);
		
		int i = Integer.parseInt(str1); // преобразует String в int
		System.out.println(i);
		
		String s = String.valueOf(i); // преобразует int в String
		System.out.println(i); 
		
		int a = 10;
		int b = 3;
		double res = a / b;
		System.out.println(res); 
		double res2 = (double) a / b;
		System.out.println(res2); 
	}

}
