package _34_Recursion;

// f(5) = 5*4*3*2*1 = 120

public class FactorialRec {

	public static void main(String[] args) {
	
		System.out.println(factor(5));

	}
	
	public static int factor(int i) {
		
		if (i == 1) return 1;
		if (i == 2) return 2;
		int res = factor(i - 1) * i; 
		i--;
		return res;
	}

}
