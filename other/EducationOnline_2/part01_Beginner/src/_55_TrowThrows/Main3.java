package _55_TrowThrows;

public class Main3 {

	public static void main(String[] args) {
		
		try {
			divide();
		} catch (Exception e) {
			System.out.println("catched");
			e.printStackTrace();			
		}
				
	}
	
	public static void divide() throws Exception {

		throw new Exception("Test throw");   // throw генерирует исключение (а - обработай сам или б - прокинь выше)
        // если исключение связано с логикой метода, то его надо обрабатывать в нем, а если с входящими данными,
		// или внешними причинами - пробрасывать вызывающему. Проброс может быть - МНОГОКРАТНЫМ
	}
}
