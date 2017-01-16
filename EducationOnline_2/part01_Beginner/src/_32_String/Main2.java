package _32_String;

public class Main2 {

	public static void main(String[] args) {	
		
	String str = "one";
	String str2 = "two";
	
	System.out.println(str);
	System.out.println(str2);
	
	str += str2;   // Строки немутирующие объекты, для конкатенации создается 3-й объект
	System.out.println(str);
	
	String s2 = "Hello";
	for (int i = 0; i < 10; i++) {
		s2 += i;                     // на каждой итерации создаем новый объект
		System.out.println(s2);
	}
	}

}
