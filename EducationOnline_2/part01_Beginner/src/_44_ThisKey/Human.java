package _44_ThisKey;

public abstract class Human {
	
	private String name;
	
	public Human() {
		System.out.println("Constructor Human()");
	}
	
	public Human(String name) {
		this.name = name;
		System.out.println("Constructor Human(String name)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
