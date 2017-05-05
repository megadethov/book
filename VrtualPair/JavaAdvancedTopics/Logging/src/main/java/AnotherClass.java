import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnotherClass {

    static Logger logger = LogManager.getLogger();

    public void testMethod() {
        logger.log(Level.FATAL, "Fatal event");
        logger.log(Level.ERROR, "Error event");
        logger.log(Level.WARN, "Warn event");
        logger.log(Level.INFO, "Info event");
        logger.log(Level.DEBUG, "Debug event");
        logger.log(Level.TRACE, "Trace event");
    }
}
