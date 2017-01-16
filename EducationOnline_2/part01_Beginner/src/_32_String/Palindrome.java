package _32_String;

public class Palindrome {

	public static void main(String[] args) {
		
		
		
		boolean b = isPalindrome("1221");	
		System.out.println(b);

	}
	// метод проверяет строку на палиндромность
	public static boolean isPalindrome(String s) {
		
		// StringBuffer  тяжелый аналог билдера для многопоточных аплик
		StringBuilder sb = new StringBuilder(s);  // создаем StringBuilder для работы с принятой на вход строкой
		                                         // s копируется в объект sb, далее работаем с sb. Оригинал s - неизменен.
		System.out.println(sb);   
		sb.reverse();   //  реверс sb
		System.out.println(sb);  //  строка в sb реверснулась
		System.out.println(s);   // строка в аргументе s осталась неизменной
		
		return sb.toString().equals(s);  // чтобы сравнить объект типа StringBuilder с объектом типа String
		                                 // вызываем метод toString для StringBuilder, зате сравниваем sb и s
	}

}
