package _25_MethodsOfClass;

/*
 Модификаторы доступа:
 default (package)
 private
 protected
 public
 
 Модификаторы методов:
 native    // JNI
 volatile  // потоки
 static
 final
 abstract
 synchronized  // потоки
 strictfp  // ограничение для вычисления чисел с плавающей точкой
 
  Модификаторы классов: 
 static
 final
 abstract
 strictfp
 
   Модификаторы полей: 
 static
 final
 transient // Свойства класса, помеченные модификатором transient, не сериализуются.
 volatile
 
 
 
 
 
 
 */

public class Plane {
	
	public String title;
	public int capacity;
	public int speed = 10;
	
	public void get(int i, String s) {
		System.out.println("It is method get. i = " + i);
	}
	
	public int f(int i) {
		if (i > 0) return 1;		
		if (i < 0) return -1;		
		return 0;
	}
	
	public int c(int i) {
		return speed - i;
	}
	

}
