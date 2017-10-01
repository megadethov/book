package _56_OwnException;

// создаем свой класс исключений
public class AutorizationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3112326672345079313L; // какая-то хрень, связанная с сериализацией (не учил ишо :()
	
	// конструктор по умолчанию
	public AutorizationException() {
		super(); // вызов родительского конструктора
	}
	// конструктор ишо один
	public AutorizationException(String message) {
		super(message);
	}

}
