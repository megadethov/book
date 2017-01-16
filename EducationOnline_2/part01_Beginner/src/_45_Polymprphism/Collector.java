package _45_Polymprphism;

public class Collector extends Workers {
	public Collector(String name, int age) {
		super(name, age);
	}

	@Override
	public void toWork() {
		System.out.println("I work as Collector");

	}
}
