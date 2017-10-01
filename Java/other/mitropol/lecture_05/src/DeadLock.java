import java.util.ArrayList;
import java.util.List;

public class DeadLock {
    public static void main(String[] args) {
        Browser browser = new Browser();
        for (int i = 0; i < 10; i++) {
            Page openPage = browser.openPage();
            System.out.println("page " + i + " OPEN");
            new Thread(() -> {
                // some logic
                openPage.close();
                System.out.println("page close");
            }).start();
        }
        browser.close();
        System.out.println("finished");
    }
}

class Browser {
    List<Page> pages = new ArrayList<>();

    synchronized Page openPage() {
        Page page = new Page(this);
        return page;
    }

    synchronized void removePage(Page p) {
        pages.remove(p);
    }

    void close() {
        for (Page p : pages) {
            p.close();
        }
    }
}

class Page {
    Browser browser;

    public Page(Browser browser) {
        this.browser = browser;
    }

    synchronized void close() {
        browser.removePage(this);
    }
}
