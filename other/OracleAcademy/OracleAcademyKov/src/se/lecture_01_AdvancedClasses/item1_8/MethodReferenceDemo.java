package se.lecture_01_AdvancedClasses.item1_8;

/**
 * Created by Yefremov Yuriy
 */
// Создано как альтернатива анонимных классов, к-ые просто реализуют метод интерфейса
// Идея - Нам не нужен класс (анонимный) как таковой нам нужен метод, к-ый реализует итерфейс
// В классе создается метод(с реализацией) с такими же параметрами как у метода нужного интерфейса
// Теперь вместо того чтобы создавать анонимный класс с реализацией интерфейса - подставляется ссылка на реализацию в др. методе
// в таком виде      ИмяКласса :: имяМетодаСРеализацией
// Можно считать это синтаксическим сахаром, тк на низком уровне лямбда выражение все равно превращается компилятором в анонимный класс
public class MethodReferenceDemo {
    public static void main(String[] args) {

 /*       print("test", new FuncForLambda() {
            @Override
            public int f(int x, String s) {

                return MethodReferenceDemo.cube(3, "anonymous"); // здесь cube() вызывался напрямую
            }
        });*/

// когда я вызываю этот print(String, интерфес) Даю строку и передаю ссылку на cube(реализация этого интерфейса)
        print("test", MethodReferenceDemo::cube); // ВМЕСТО АНОНИМНОГО КЛАССА СРАЗУ ПЕРЕДАЕТСЯ ССЫЛКА НА МЕТОД С РЕАЛИЗАЦИЕЙ
       /* print("test", MethodReferenceDemo::cube2);

        System.out.println("-----------------");

        int cube = MethodReferenceDemo.cube(2, "");
        System.out.println(cube);*/
    }

    static void print(String str, FuncForLambda func) // принимает в параметрах интерфейс
    {
        System.out.println(str + " " + func.f(3, "lambda"));
    }

    // чтобы быть реализацией интерфейся и использоваться как ссылка на интерфейс
    static int cube(int x, String s) { // параметры должны соответствовать параметрам интерфейса
        System.out.println(s);
        return x + x;
    }

    static int cube2(int x, String s) {
        System.out.println(s);
        return x * x;
    }
}

// у интерфейса всего лишь один метод
interface FuncForLambda {
    int f(int x, String s); // тут строго до должны совпадать параметры с cube(). Деваться некуда - метод в интерфейсе
    // один и как бы сразу реаализацией становится cube()
}