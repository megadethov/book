package java2.lesson02_DataBase.ex2_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Created by mega on 10.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Hello world");
    }
}
/*
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.*/

// need add bindings
// slf4j-simple-1.7.9

// slf4j.org/manual.html