public class Monitors {
    public static void main(String[] args) throws InterruptedException {
        Object ob = new Object();

        synchronized (ob) {
            ob.wait();
        }

        synchronized (ob) {
            ob.notify();
        }
    }
}
