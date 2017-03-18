package se.lecture_01_AdvancedClasses.item1_4;

/**
 * Created by Yefremov Yuriy
 */
public class Main {
    public static void main(String[] args) {
        // Оболочки все - final и not mutable
        String str = "Hello"; // final not mutable
        System.out.println(str.substring(1, 3));
        System.out.println(str);
        // У String существует pull в к-ый помещаются строк для избежания их дублирования в хипе
        String str2 = "Hello"; // такая строка есть в пуле и ссылка будет на нее, new не будет
        System.out.println(str == str2); // ссылаются на однку и туже строку
    }
}

class FinalExplanation { // если объявить класс как final - от него нельзя наследоваться

    // это блок инициализации - всегда отработает после статики, перед конструктором
    {
        System.out.println("test");
        ref2 = "create"; // и хотя при выполнении блока ref2 не объявлена еще, компилятор умный и видит ее ниже в коде
//        System.out.println(ref2); // необъяснимая магия - выше разрешил инициализацию, а чтение нет
    }

    //    public final String ref1; // ошибка компиляции, переменная final должна быть проинициализирована
    public final String ref2; // компилируется, тк переменная проинициализирована выше в блоке инициализации

    public final void doSomething() { // метод не может быть переопределен!
    }
}
