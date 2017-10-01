public class Monitors {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();

        /*Thread t0 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    resource.push(i);
                    System.err.println("pushing " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t0.start();*/

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    resource.push(i);
                    System.err.println("pushing " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Object res = resource.pool();
                    System.err.println("pooled " + res);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }
}

class Resource {
    Object ob = null;

    synchronized void push(Object ob) throws InterruptedException {
        if (this.ob != null) {
            wait();
        }
        this.ob = ob;
        notify();
    }

    synchronized Object pool() throws InterruptedException {
        if (this.ob == null) {
            wait();
        }
        Object res = ob;
        ob = null;
        notify();
        return res;
    }
}