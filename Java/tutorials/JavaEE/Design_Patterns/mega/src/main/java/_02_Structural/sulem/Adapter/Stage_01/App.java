package _02_Structural.sulem.Adapter.Stage_01;

public class App {
    public static void main(String[] args) {
        Database db = new AdapterDaoToDatabase();
        db.insert();
        db.select();
        db.update();
        db.delete();
    }
}
