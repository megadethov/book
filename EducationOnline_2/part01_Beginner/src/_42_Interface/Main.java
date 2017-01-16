package _42_Interface;

public class Main {

	public static void main(String[] args) {
		
		Shape shape = new Rect();
		Shape shape2 = new Circle();
		 
	   Rect rect = (Rect) shape;
	   rect.setSideA(10);
	   rect.setSideB(2);
	   rect.perimetr();
	   
	   Circle circle = (Circle) shape2;
	   circle.setRadius(10);
	   circle.perimetr();
	    
		

	}

}
