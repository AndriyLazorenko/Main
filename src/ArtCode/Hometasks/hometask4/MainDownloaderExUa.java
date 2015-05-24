package ArtCode.Hometasks.hometask4;

import ArtCode.Lessons.lesson9.DomParserTest;
import ArtCode.Lessons.lesson9.MyDOMParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 23-May-15.
 */
public class MainDownloaderExUa {
    public static final String destination = "G:\\Music";
    public static final String tag = "a";
    public static final String att = "rel";
    public static void main(String[] args) throws IOException, URISyntaxException, ParserConfigurationException, SAXException {
        System.out.println("Insert an URL: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String URL = br.readLine();
        Document document = Jsoup.connect(URL).get();
        Elements elements = document.getElementsByAttribute(att);

        for (Element e : elements) {
            if (e.text().contains(".mp3")) {
                String downloadURL = URL.substring(0, URL.lastIndexOf("/"));
                downloadURL = downloadURL + e.attr("href");
                downloadURL = downloadURL.replace("get", "load");
                String finalDestination = destination + "\\" + e.text();
                System.out.println(downloadURL);
                download(downloadURL, finalDestination);
            }
        }
    }


        public static void download(String url, String dest){
            try (OutputStream os = new FileOutputStream(dest)){

                URL uri = new URI(url).toURL();
                InputStream is = uri.openStream();

                byte[] buff = new byte[1000000];
                int count = 0;
                while((count = is.read(buff)) != -1){
                    os.write(buff,0,count);
                    os.flush();
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Old methodological attempt
//        int counter=0;
//        for (Element e:elements){
//            if (e.text().contains(".mp3")){
//                counter++;
//            }
//        }
//
//        String[] namesOfMP3Files = new String[counter];
//        int i=0;
//        for (Element e:elements){
//            if (e.text().contains(".mp3")){
//                namesOfMP3Files[i] = e.text();
//                i++;
//            }
//        }
//        i=0;
//        for (Element e: elements){
//            if (e.text().equals("загрузить")) {
//                System.out.println(e.toString());
//                String downloadURL = URL+e.attr("href");
//                String finalDestination = destination+namesOfMP3Files[i];
//                i++;
////                download(downloadURL,finalDestination);
//                System.out.println(downloadURL);
//            }
//        }
//        download(URL, destination);



    public static String parsePage(String url) throws URISyntaxException, IOException {
        URL uri = new URI(url).toURL();
        InputStream is = uri.openStream();
        BufferedReader br1 = new BufferedReader(new InputStreamReader(is));
        String forRet = null;
        String buff = br1.readLine();
        while (!buff.equals(null)) {
            forRet += buff;
        }
        return forRet;
    }
}


