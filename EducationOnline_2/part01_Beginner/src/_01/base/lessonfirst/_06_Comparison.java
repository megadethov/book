package _01.base.lessonfirst;

public class _06_Comparison {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// boolean flag = false; // false
		// boolean flag = a == b; // false
		// boolean flag = a != b; // true
		// boolean flag = (a != b) && (a <= b); // true
		 boolean flag = !true; // false
		
		// boolean flag = true && true && true; // true
		// boolean flag = false && true && true; // false (after 1 false - dead code!!!)
		
		// false && true && true && true && true // fast algorithm
		// true && true && true && true && false // slow algorithm
		
		// boolean flag = true || false || false; // true
		// boolean flag = false || false || false; // false
		// true || false || false || false || false // fast algorithm
		// false || false || false || false || true // slow algorithm	
		
		
		System.out.println(flag);

	}

}
