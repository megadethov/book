package ua.mega;

/**
 * Created by Yefremov Yuriy
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printHuman(new Human(25, "Vasya"));
    }

    public static void printHuman(final Human human) { // final ссылочная переменная-параметр метода
//        human = new Human(45, "Kolya"); // нельзя final ссылке присвоить другой объект
        human.setAge(100); // но сам объект менять можем
        System.out.println(human); // age поменялся с 25 на 100
        // менять аргумент в методе считается плохим тоном
    }

}
