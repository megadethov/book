package _38_ArrayOfObjects;

public class Main {

	public static void main(String[] args) {

		Cat[] cat = new Cat[6];
		cat[0] = new Cat("Tom");
		cat[1] = new Cat("Bas");
		cat[2] = new Cat("Rutter");
		cat[3] = new Cat("Death");
		// cat[4] = new Cat("Dron");
		cat[5] = new CatEnglish("ENG"); // в массив объектов типа Cat можем ложить не только данные объекты,
		                                // но и подклассы

		
		try {
		// foreach
		for (Cat c : cat) {
			System.out.println(c.getName());
		}
		} catch (NullPointerException e) {
			System.out.println("no value");
		
		}
		System.out.println();
		System.out.println(cat[5].getName()); // в массив объектов типа Cat можем ложить не только данные объекты,
                                              // но и подклассы
	}

}
