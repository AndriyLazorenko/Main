package ArtCode.Lessons.lesson9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by Master on 22-May-15.
 */
public class TestLoading {
    public static void main(String[] args) throws URISyntaxException, IOException {
//        URI uri = new URI();
        download("http://www.ex.ua/load/166389661","/home/serhii/IdeaProjects/ACP6/temp/music.mp3");
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
}
