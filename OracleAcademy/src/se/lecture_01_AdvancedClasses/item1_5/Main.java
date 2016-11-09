package se.lecture_01_AdvancedClasses.item1_5;

/**
 * Created by Yefremov Yuriy
 */
// Вся статика пренадлежит классу, а не конкретному объекту
// Статик поле класса существует в одном экземпляре для всех
public class Main {
    public static void main(String[] args) {

        StaticExplanation.ref1 = "hello"; // меняем значение статик переменной
        StaticExplanation explanation1 = new StaticExplanation(); // новый объект1
        StaticExplanation explanation2 = new StaticExplanation(); // еще объект2

        explanation1.ref2 = "explanation1"; // сетим поле объект1
        explanation2.ref2 = "explanation2"; // сетим это же поле объект2

        System.out.println(explanation1.ref2); // поле объект1
        System.out.println(explanation2.ref2); // поле объект2
        System.out.println(StaticExplanation.ref1); // статик поле
        StaticExplanation.ref1 = "hello world"; // меняем значение статик поля
        System.out.println(StaticExplanation.ref1); // статик поле
    }
}

class StaticExplanation {
    /*public static StaticExplanation() { // ошибка компиляции, конструктор
        // не может быть статичым
    }*/

    static String ref1 = "A"; // инициализируется в первую очередь,
    // принадлежит классу, а не конструктору.

    String ref2 = "B";

    public static void someMethod() { // может быть переггруженным, но не
        //переопределенным в классах наследниках.

       /* System.out.println(ref2); // ошибка компиляции, нельзя обращаться из
        //статики к не статике*/
    }
}
