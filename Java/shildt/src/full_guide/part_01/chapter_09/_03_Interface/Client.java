package full_guide.part_01.chapter_09._03_Interface;

/**
 * Created by mega on 26.08.2016.
 */
public class Client implements Callback {

    @Override
//     void callback(int param) { // НЕЛЬЗЯ сужать область видимости ниже public
    public void callback(int param) {
        System.out.println("Implement callback() with param = " + param);
    }
    public void callbackToo(int param) {
        System.out.println("Own callbackToo() with param = " + param);
    }
}
class AnotherClient implements Callback {

    @Override
    public void callback(int param) {
        System.out.println("Another Implement callback() with param = " + param);
    }
}

class Test {
    public static void main(String[] args) {
        Client client = new Client();
        client.callback(100);
        client.callbackToo(1000);

    }
}
class Test2 {
    public static void main(String[] args) {

        Callback client = new Client(); // ссылка типа интерфейс, обеспечивает динамическую диспетчеризацию
        Callback anotherClient = new AnotherClient();

        client.callback(100); // полиморфизм - реализация callback() выбирается в runtime
//        client.callbackToo(1000); // У Callback нет такого метода
        anotherClient.callback(33); // полиморфизм - реализация callback() выбирается в runtime

    }
}
