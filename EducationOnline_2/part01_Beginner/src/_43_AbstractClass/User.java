package _43_AbstractClass;

// абстрактный класс позволяет запретить инстанс и избежать дублирования кода(полей)
// методы тоже могут быть абстрактными(без тела) в абстрактном классе
public abstract class User {
	private String firstName;
	private String lasttName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	
	
}
