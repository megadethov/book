package _34_Recursion;

public class MyClass {

	public void methodOne() {
		
			methodTwo(); // вызов метода из др. метода
			methodOne(); // рекурсивный вызов метода (сам себя)	
			// если нет условия выхода бесконечная рекурсия переполняет стек StackOverflowError
			
/*
 РАБОТА СТЕКА
 
f() ->  f2() -> f3() -> f4() -> f5() -> f6() -> f7()
f() ->  f2() -> f3() -> f4() -> f5() -> f6() <- f7()
f() ->  f2() -> f3() -> f4() -> f5() <- f6()
f() ->  f2() -> f3() -> f4() -> f5()
f() ->  f2() -> f3() <- f4()
f() ->  f2() <- f3()
f() <-  f2()
f() 
 
 */
		
	}

	public void methodTwo() {

	}
}
