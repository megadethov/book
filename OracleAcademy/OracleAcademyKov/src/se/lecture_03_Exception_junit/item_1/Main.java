package se.lecture_03_Exception_junit.item_1;

public class Main {
    public static void main(String[] args){
        try (MyAutoClose x = new MyAutoClose("x")) {
//            x = new MyAutoClose(""); // ошибка компиляции x - final
            System.out.println("body");
//            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new NullPointerException();
        }
    }

}
// если не имплементить AutoCloseable, то try with resources не работает
class MyAutoClose implements AutoCloseable { // обязаны переопределить метод close()
    private String message; // сообщение

    public MyAutoClose(String message) {
        this.message = message;
        System.out.println("new: " + message); // сообщене при создании инстанса
    }


    @Override
    public void close() {
        System.out.println("close: " + message); // просто выводит сообщение о закрытии
    }
}
