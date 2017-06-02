package _55_TrowThrows;

public class Main {

	public static void main(String[] args) {

		divide(6, 0);
	}

	// сообщаем (throws ArithmeticException), что метод может выбросить exception
	// throws в сигнатуре - подбросить в случае возникновения наверх в вызывающий метод
	// компилятор не обязывает main() обрабатывать ArithmeticException тк оно RuntimeException - unchecked
	// в результате в случае /0 получим системный стек трейс с ошибкой
	
	public static void divide(int a, int b) throws ArithmeticException {

		System.out.println(a / b);

	}
}
