package se.lecture_01_AdvancedClasses.inner_nested_anonym;

/**
 * Created by Yefremov Yuriy
 */
// Анонимный класс создается один раз, не имеет имени, обращаться к нему нельзя, создать еше экземпляр - нельзя
// Удобно если нужно выполнить кукую-то логику 1 раз, чтобы не создавать для этого именованный отдельный класс
public class MyAnonymClass {
    public static void main(String[] args) {
//      new Test(); // создать инстанс интерфейса нельзя
        // а так можно, если реализовать его методы
        new Test() {
            @Override
            public void test() {

            }
        }; // Анонимный класс нужно заканчивать ;
    }
}

// Интерфейс у которого только 1 метод - функциональный, используется в лямбдах
interface Test {
    void test();
}
