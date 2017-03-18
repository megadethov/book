package _42_Interface;

public class Circle implements Shape {
private int radius;



public int getRadius() {
	return radius;
}



public void setRadius(int radius) {
	this.radius = radius;
}



@Override
public void perimetr() {
	System.out.println("S: " + 2 * Math.PI * radius);
}

}
