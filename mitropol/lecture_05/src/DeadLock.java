import java.util.ArrayList;
import java.util.List;

public class DeadLock {
    public static void main(String[] args) {
        Browser browser = new Browser();
        for (int i = 0; i < 5; i++) {
          Page openPage = browser.openPage();
        }
        browser.close();
    }
}

class Browser {
    List<Page> pages = new ArrayList<>();

    Page openPage() {
        Page page = new Page(this);
        return page;
    }
    void removePage(Page p) {
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
    void close() {
        browser.removePage(this);
    }
}
