package _31_Casting;

public class CastingTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		// User user = (User) employee;     // It's work
		User user = employee;
		// Employee employee2 = user;   // так нельзя РOДИТЕЛЬ В ПОТОМКА НЕ ВЛЕЗЕТ
		Employee employee3 = (Employee) user;   // ПОСЛЕ ПРИВЕДЕНИЯ к (потомку) ВЛЕЗЕТ
		
		Object o = new Client();
		// Client client = o;     // don't work
		Client client = (Client) o;  // It's work
		
		Client client2 = new Client();
		Object obj = client2;           //   It's work
		
		// Integer i = (Intejer) employee;     //  don't work   Кирпич в Собаку   - разные линии наследования
		// С целью избежать подобных проблем был придуман механизм GENERICS
		
		
		

	}

}
