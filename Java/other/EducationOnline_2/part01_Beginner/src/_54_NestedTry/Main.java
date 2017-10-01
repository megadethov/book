package _54_NestedTry;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println("try 1 - start");
			System.out.println(10 / 1); // источник ошибки знаменатель 0
			System.out.println("try 1 - end");
			try {
				System.out.println("try 2 - start");
				System.out.println(10 / 0); // источник ошибки знаменатель 0
				System.out.println("try 2 - end");
			} catch (Exception e) {
				System.out.println("catch 2 - work");
			} finally {
				System.out.println("finally 2 - work");
			}
			
		} catch (Exception e) {
			System.out.println("catch 1 - work");
		} finally {
			System.out.println("finally 1 - work");
		}
		

	}

}
