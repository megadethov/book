package _45_Polymprphism;

public abstract class Workers {
	private String name;
	private int age;

	public Workers(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void toWork();

}
