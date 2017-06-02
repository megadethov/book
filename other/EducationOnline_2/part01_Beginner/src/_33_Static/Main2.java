package _33_Static;

public class Main2 {

	public static void main(String[] args) {

		AboutStatic st = new AboutStatic();
		AboutStatic st2 = new AboutStatic();
		AboutStatic st3 = new AboutStatic();

		AboutStatic.sd = 10; // ини статик поле ч/з класс
		st.d = 1; // ини поле конкретного инстанса
		st2.d = 2; // ини поле конкретного инстанса
		st3.d = 3; // ини поле конкретного инстанса

		st.mult(); // вызов метода, используещего в расчете статик поле
		st2.mult(); // вызов метода, используещего в расчете статик поле
		st3.mult(); // вызов метода, используещего в расчете статик поле

		// из статик метода main() можно вызвать только статик методы
		stat(2.0);  // статик из статика вызывается
		// nonStat(2.0);  // не статик из статика не вызывается
		
		AboutStatic.square(2); // вызов статик метода др. возможен без создания его инстанса
	}

	// статик методы могут вызываться из др статик методов
	public static void stat(double d) {
	}

	// не статик методы не могут вызываться из др статик методов
	public void nonStat(double d) {
	}

}
