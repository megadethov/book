package se.lecture_01_AdvancedClasses.inner_nested_anonym;

/**
 * Created by Yefremov Yuriy
 */
// Анонимный класс создается один раз, не имеет имени, обращаться к нему нельзя, создать еше экземпляр - нельзя
// Удобно если нужно выполнить кукую-то логику 1 раз, чтобы не создавать для этого именованный отдельный класс
// По доступу к Внешнему классу схож с Локальными классами
public class MyAnonymClass2 {

    public static void main(String[] args) {
        // создаем инстанс нашего класса, чтобы вызвать у него метод
        MyAnonymClass2 ref2 = new MyAnonymClass2();
// вызываем метод и аргумент для него создаем прямо в скобках - анонимный класс
        ref2.print(new Test2() {
            @Override
            public void test() {

            }
        });

        // можно создать анонимный класс и тут жевызвать его метод
        new Test2() {

            @Override
            public void test() {
                System.out.println("Hello from anonymous");
            }
        }.test();
    }

    // Есть метод с параметром - объект. Можно не создавать заранее аргумент - объект, а прямо в круглых скобках метода
    // писать анонимный класс с реализацией - он и будет аргументом метода
    public static void print(Test2 t2) {
        System.out.println(t2); // в имени анонимного класса всегда присутствует знак - $
    }
}

interface Test2 {
    void test();
}

