package ArtCode.Lessons.lesson10;

import org.apache.log4j.*;
import org.apache.log4j.helpers.DateLayout;
import org.apache.log4j.spi.LoggingEvent;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Master on 23-May-15.
 */
public class LoggerFile {
    public static final String name = "main";
    public static final String path = "C:\\Users\\Master\\IdeaProjects\\New\\src\\ArtCode\\Temp\\log.txt";

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(name);
        logger.setLevel(Level.INFO);

        Layout myLayout = new DateLayout() {


            @Override
            public String format(LoggingEvent event) {
                String forRet = "";
                SimpleDateFormat sdf = new SimpleDateFormat("ss:mm:hh dd/MM/y");
                Date date = new Date();
                date.setTime(event.getTimeStamp());
                forRet += sdf.format(date)+"-";
                forRet +=event.getLevel().toString()+"-";
                forRet +=event.getMessage().toString();
                return forRet;
            }

            @Override
            public boolean ignoresThrowable() {
                return false;
            }
        };
        try {
            Appender appender = new FileAppender(myLayout,path);
            appender.setName(name);

            logger.addAppender(appender);

            logger.fatal("program starts");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
