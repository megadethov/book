package _32_String;

public class Main3 {

	public static void main(String[] args) {	
		
		StringBuilder sBuilder = new StringBuilder("12345"); // позволяет решить проблему конкатенации (не созд новые инстансы)
		String s = " plus";
		sBuilder.append(s);  //  склевает строки	
	System.out.println(sBuilder);
	
	System.out.println(sBuilder.substring(0, 2));  // берет символы 0, 1 // строка осталась неизменной !!!!!!
	System.out.println(sBuilder);   // строка осталась неизменной !!!!!!
	
	sBuilder.insert(0, '$');    // строка изменилась
	System.out.println(sBuilder);   //  строка изменилась !!!!!!
	
	System.out.println(sBuilder.reverse());
	System.out.println(sBuilder);   //  строка изменилась !!!!!!
	
		
	
	}

}
