package ArtCode.Lessons.lesson9;

import jdk.internal.org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by Master on 17-May-15.
 */
public class SAXParserTest {
    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        MySAXHandler handler = new MySAXHandler();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
//        parser.parse(new File ("C:\\Users\\Master\\IdeaProjects\\New\\src\\ArtCode\\Lessons\\lesson9\\info.xml"),handler);
    }
}
class MySAXHandler extends DefaultHandler {

}

