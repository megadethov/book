import java.io.Serializable;

public class Ticket implements Serializable {
    public Ticket(String id, String title) {
        this.id = id;
        this.title = title;
    }

    String id;
    String title;
}
