package _29_Examples;

public class RectanglePoint {

	private Point pointA = new Point(0.0, 0.0);
	private Point pointB = new Point(10, 10);
	
	public RectanglePoint(Point pointA, Point pointB) {
		this.pointA = pointA;
		this.pointB = pointB;
	}
	public RectanglePoint() {
		
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
}
