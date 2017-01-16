package _25_MethodsOfClass;

public class PlaneTest {

	public static void main(String[] args) {

		Plane plane = new Plane();
		plane.title = "Boeing 787";
		plane.speed = 1000;
		plane.capacity = 300;

		Plane plane2 = new Plane();
		plane2.title = "Boeing 777";
		plane2.speed = 2000;
		plane2.capacity = 400;

		plane.get(1, "");
		plane2.get(2, "");
		
		byte b = (byte) plane.f(10);
		System.out.println(b);
		
		System.out.println(plane.c(2));
		System.out.println(plane2.c(3));
		
		
		

	}

}
