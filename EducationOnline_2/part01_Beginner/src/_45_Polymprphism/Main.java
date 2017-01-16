package _45_Polymprphism;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Bob", 34);
		Collector collector = new Collector("Ascon", 40);
		
		employee.toWork();
		collector.toWork();

	}

}
