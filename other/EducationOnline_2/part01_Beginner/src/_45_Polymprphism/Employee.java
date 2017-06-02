package _45_Polymprphism;

public class Employee extends Workers {
	
	public Employee(String name, int age) {
		super(name, age);
	}
	
	   @Override
		public void toWork() {
			System.out.println("I work as Employee");
			
	}
}
