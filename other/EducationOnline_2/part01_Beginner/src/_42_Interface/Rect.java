package _42_Interface;

public class Rect implements Shape {
	
	private int sideA;
	private int sideB;
	
	
	
	public int getSideA() {
		return sideA;
	}



	public void setSideA(int sideA) {
		this.sideA = sideA;
	}



	public int getSideB() {
		return sideB;
	}



	public void setSideB(int sideB) {
		this.sideB = sideB;
	}



	@Override
	public void perimetr() {
		System.out.println("S: " + sideA * 2 + sideB * 2);
	}
}
