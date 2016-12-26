import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        loadDriver();
    }

    private static void loadDriver() {
        try {
            LOGGER.info("Loading JDBC driver: org.postgresql.Driver");
            Class.forName("org.postgresql.Driver");
            LOGGER.info("Driver loaded successful");
        } catch (ClassNotFoundException e) {
           LOGGER.error("Can't find driver: org.postgresql.Driver");
            throw new RuntimeException(e);
        }
    }

}
