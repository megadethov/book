package _29_Examples;

public class Rectangle {
	private double width;
	private double height;

	public Rectangle() {

	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double square(double w, double h) {
		return w * h;
	}

	public double perimetr(double w, double h) {
		return w * 2 + h * 2;
	}

	public boolean isSquare(double w, double h) {
		if (w == h)
			return true;
		else
			return false;
	}
}
