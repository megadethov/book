package _32_String;

public class Main {

	public static void main(String[] args) {
		
	// "It's object without ref";	
	// String s = new String(" ");
		
	String str = "It's string";
	String str2 = "It's string";
	String str3 = " + It's concat";
	
	System.out.println(str.concat(str3));
	
	System.out.println(str.charAt(0));   // берет символ с индексом 0....
	System.out.println(str.length()); // длина строки включая пробелы
	System.out.println(str.equals(str2)); // true   сравнивает строки
	
	
	
	// BAD CODE 10 instance
	for (int i = 0; i < 10; i++) {
		System.out.println("Hello 10 instance");
	}
	
	// GOOD CODE 1 instance
	String s2 = "Hello 1 instance";
		for (int i = 0; i < 10; i++) {
			System.out.println(s2);
		}
	

	}

}
