package ArtCode.Lessons.lesson10;

import org.apache.log4j.*;
import org.apache.log4j.helpers.DateLayout;
import org.apache.log4j.spi.LoggingEvent;

/**
 * Created by Master on 23-May-15.
 */
public class LoggerSimple {
    public static final String name = "main";
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(name);
        logger.setLevel(Level.INFO);

        Layout layout = new SimpleLayout();

        Layout myLayout = new DateLayout() {
            @Override
            public String format(LoggingEvent event) {
                return null;
            }

            @Override
            public boolean ignoresThrowable() {
                return false;
            }
        };

        Appender appender = new ConsoleAppender(layout);
        appender.setName(name);

        logger.addAppender(appender);

        logger.fatal("program starts");
    }
}
