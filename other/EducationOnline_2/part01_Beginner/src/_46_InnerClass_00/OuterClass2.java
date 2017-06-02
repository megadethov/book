package _46_InnerClass_00;

public class OuterClass2 {
	
	private int nonStaticField = 5;
	private static int staticField = 100;

	// static nested class
	public static class StaticNestedClass {
		// отсюда есть доступ только к статик полям и методам
	}

	// non-static nested class - inner
	public class InnerClass {
// отсюда есть доступ ко всем полям и методам

	}
}
