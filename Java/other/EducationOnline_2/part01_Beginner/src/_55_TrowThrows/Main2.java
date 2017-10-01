package _55_TrowThrows;

public class Main2 {

	public static void main(String[] args) {

		try {
			divide(6, 0);
		} catch (Exception e) {
			System.out.println("/ 0");
		}
	}

	// сообщаем (throws Exception), что метод может выбросить exception
	// throws в сигнатуре - подбросить в случае возникновени€ наверх в вызывающий метод
	// компил€тор ќЅя«џ¬ј≈“ main() обрабатывать Exception тк оно - checked	
	
	public static void divide(int a, int b) throws Exception {

		System.out.println(a / b);

	}
}
