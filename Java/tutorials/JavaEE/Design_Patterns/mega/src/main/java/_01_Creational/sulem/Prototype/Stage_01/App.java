package _01_Creational.sulem.Prototype.Stage_01;

public class App {
    public static void main(String[] args) {
        Project original = new Project(1, "Navigator", "System.out.println();");
        System.out.println(original);

        // Клонируем
        Project copy = (Project) original.copy();
        System.out.println(copy);
    }
}
