package _31_Casting;

public class Main {

	public static void main(String[] args) {
		String s = "1234";
		
		/*int i = Integer.parseInt(s);        // parseInt(s) - возвращает int , быстрее
		System.out.println(i);*/
		
		int i = Integer.valueOf(s);           // alueOf(s) - возвращает Integer (в i = int autoboxing)
		System.out.println(i);
		
		double d = Double.parseDouble("1234.5");
		System.out.println(d);
		
		String str = String.valueOf(i);
		System.out.println(str);
				
				

	}

}
