import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.log(Level.FATAL, "Fatal event");
        logger.log(Level.ERROR, "Error event");
        logger.log(Level.WARN, "Warn event");
        logger.log(Level.INFO, "Info event");
        logger.log(Level.DEBUG, "Debug event");
        logger.log(Level.TRACE, "Trace event");

        AnotherClass ac = new AnotherClass();
        ac.testMethod();

    }
}
