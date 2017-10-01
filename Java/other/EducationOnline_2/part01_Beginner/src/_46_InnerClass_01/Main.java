package _46_InnerClass_01;

public class Main {

	public static void main(String[] args) {

		Integer[] values = { 1, 2, 3, 4, 5 };

		Collection collect = new Collection(values);
	 Itarable iterable = collect.createForward();

		while (iterable.hasNext()) {
		Integer value = (Integer) iterable.getValue();
		System.out.println(value);
		}
	}
}