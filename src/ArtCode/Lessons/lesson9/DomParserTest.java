package ArtCode.Lessons.lesson9;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Master on 17-May-15.
 */
public class DomParserTest{
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File
                    ("C:\\Users\\Master\\IdeaProjects\\New\\src\\ArtCode\\Lessons\\lesson9\\info.xml"));
            Element element = document.getDocumentElement();
            showElement(element);
            showXML(element);
//            someActions(element);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void showElement(Element element){
        System.out.println("name = " + element.getTagName());
        System.out.println("has child = " + element.hasChildNodes());
        System.out.println();
    }
    public static void someActions(Element element){
        NodeList children = element.getChildNodes();
        for (int i = 0; i <children.getLength() ; i++) {
            Node node = children.item(i);
            if (node.getNodeType()==Node.ELEMENT_NODE){
                Element element1 = (Element) node;
                System.out.println(element1.getTagName());
            }
            else if (node.getNodeType()==Node.TEXT_NODE) {
                Text text = (Text) node;
                String content = text.getNodeValue();
                System.out.println(content);
            }
        }
    }
    public static void showXML(Element root){
        NodeList children = root.getChildNodes();
        for (int i = 0; i <children.getLength(); i++) {
            Node node = children.item(i);
            if (node.getNodeType()==Node.ELEMENT_NODE){
                Element element1 = (Element) node;
                String tag = element1.getTagName();
                NamedNodeMap map = element1.getAttributes();
//                String att = map.getNamedItem();
                System.out.print("<"+tag+">");
                showXML(element1);
                System.out.println("<\\"+tag+">");
            }
            else if (node.getNodeType()==Node.TEXT_NODE) {
                Text text = (Text) node;
                String content = text.getNodeValue();
                String trimCont = content.trim();

                if (!trimCont.equals("")){
                    System.out.print(trimCont);
                }
            }
        }
    }
}
