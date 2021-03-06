package ArtCode.Lessons.lesson9.XML;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Master on 22-May-15.
 */
public class DomParserSimpleTest {
    public static final String PATHNAME = "C:\\Users\\Master\\IdeaProjects\\New\\src\\ArtCode\\Temp\\team.xml";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory =
                DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder =
                factory.newDocumentBuilder();

        Document document = documentBuilder.parse(new File(PATHNAME));
        Element root = document.getDocumentElement();
//        showElementInfo(root);

//        NodeList children = root.getChildNodes();
//        for (int i = 0; i < children.getLength(); i++) {
//            Node node = children.item(i);
//            if(node.getNodeType() == Node.ELEMENT_NODE){
//                Element element = (Element) node;
//                System.out.printf("<%s>", element.getTagName());
//            } else if(node.getNodeType() == Node.TEXT_NODE){
//                Text text = (Text) node;
//                String content = text.getNodeValue();
//                System.out.println(content);
//            }
//
//        }

        System.out.println("RESULT");
        String content = DomParsingUtils.getTextXMLContent(root);
        System.out.println(content);

    }

    public static void showXml(Element root){

    }


    public static void showElementInfo(Element element){
        System.out.println("name " + element.getTagName());
        System.out.println("has child " + element.hasChildNodes());
    }
}
