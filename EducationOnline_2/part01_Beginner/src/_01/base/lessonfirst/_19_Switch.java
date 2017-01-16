package _01.base.lessonfirst;

public class _19_Switch {

	public static void main(String[] args) {
		/*
		 switch (value) {
		        case value_1:
		             .......
		             break;
		        case value_2:
		             .......
		             break;
		        default:
		             ......	
		        }	 
		 */
		
		double d = 10;
		double r = 2;
		double result = 0;
		char ch = '*';
		
		switch (ch) {
		case '+': result = d + r; break;
		case '-': result = d - r; break;
		case '/': result = d / r; break;
		case '*': result = d * r; break;
		default: System.out.println("Something wrong!!!");
		}
		
		System.out.printf("%.2f %s %.2f = %.2f", d, String.valueOf(ch), r, result);

	}

}
