package java2.lesson02_DataBase.ex2_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mega on 09.09.2016.
 */
public class Wombat {
    final Logger logger = LoggerFactory.getLogger(Wombat.class); // получили logger для класса Wombat
    Integer currentTemp;
    Integer oldTemp;

    public static void main(String[] args) {
        new Wombat().setTemp(60);
    }

    public void setTemp(Integer newTemp) {
        oldTemp = currentTemp;
        currentTemp = newTemp;

        // bad example (конструирование строки происходит до вызова функции! Даже при отключении лога тратятся ресурсы в боевом режиме!
//        logger.info("Old temp was " + oldTemp + ". New temp set to " + currentTemp);

        // not so bad example in log4j
//        if (logger.isDebugEnabled()) {
//            logger.debug("Old temp was " + oldTemp + ". New temp set to " + currentTemp);
//        }


        // good example
//        System.out.printf("%s adf %d sdf", "new", 23);
        logger.info("Old temp was {}. New temp set to {}", oldTemp, currentTemp);
        logger.error("test");

        if (currentTemp > 50) {
            logger.warn("too hot...");
        }
    }
}
// read www.habrahabr.ru/post/113145 История логгинга

// skipy.ru/useful/logging.html