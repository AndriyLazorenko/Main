package ArtCode.Lessons.lesson9;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by Master on 23-May-15.
 */
public class MyDOMParser {
    Element root;
    public void init(String url) throws ParserConfigurationException, IOException, SAXException, URISyntaxException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        URL uri = new URI(url).toURL();
        InputStream is = uri.openStream();
        Document document = builder.parse(is);
        Element element = document.getDocumentElement();
        this.root = element;
    }

    public String getXMLcontent (){
        String forRet = "<"+root.getNodeName()+(root.hasAttributes() ? getAttributes(root) : "")+">";
        if (!root.hasChildNodes())
            return forRet;
        else{
            NodeList children = root.getChildNodes();
            for (int i = 0; i <children.getLength(); i++) {
                Node node = children.item(i);
                if (node.getNodeType()==Node.ELEMENT_NODE){
                    Element element1 = (Element) node;
                    forRet+=getXMLcontent(element1);
                }
                else if (node.getNodeType()==Node.TEXT_NODE) {
                    Text text = (Text) node;
                    String content = text.getTextContent();
                    if (!content.isEmpty()) {
                        forRet += content;
                    }
                }
            }
            forRet += "";
        }
        return forRet+= "</"+root.getNodeName()+">";
    }

        public String getXMLcontent (Element root){
            String forRet = "<"+root.getNodeName()+(root.hasAttributes() ? getAttributes(root) : "")+">";
            if (!root.hasChildNodes())
                return forRet;
            else{
                NodeList children = root.getChildNodes();
                for (int i = 0; i <children.getLength(); i++) {
                    Node node = children.item(i);
                    if (node.getNodeType()==Node.ELEMENT_NODE){
                        Element element1 = (Element) node;
                        forRet+=getXMLcontent(element1);
                    }
                    else if (node.getNodeType()==Node.TEXT_NODE) {
                        Text text = (Text) node;
                        String content = text.getTextContent();
                        if (!content.isEmpty()) {
                            forRet += content;
                        }
                    }
                }
                forRet += "";
            }
            return forRet+= "</"+root.getNodeName()+">";
        }
        public String getAttributes(Element element){
            NamedNodeMap map = element.getAttributes();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < map.getLength(); i++) {
                Attr attr = (Attr) map.item(i);
                sb.append(" ").append(attr.getName()).append("=").append("\"").append(attr.getValue()).append("\"");
            }
            return sb.toString();
        }
    }
