package _23_ClassObject;

public class PlaneTest2 {

	public static void main(String[] args) {
		
		Plane plane = new Plane();
		
		plane.speed = 111;
		
		int a = new Plane().speed;
		System.out.println(a);
		
		System.out.println(plane.speed);

	}

}
