package _01.base.lessonfirst;

public class _05_Increment {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;	
		
//		System.out.println(a++ + --a);  // 10
//		System.out.println(a++ + --b);  // 9
		
		
		            //5   4       4       3   5
		int result = (a + b-- + --a) * (--b + a++);
				  // (5	+ 5   +   4) * (  3 + 4  ) = 14 * 7 = 98
		
		System.out.println("result = " + result);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
	}

}
