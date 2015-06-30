package ArtCode.Lessons.lesson16;

import java.io.*;
import java.util.Properties;

/**
 * Created by andriylazorenko on 13.06.15.
 */
public class DependencyInjectorImpl implements DependencyInjector{

    @Override
    public void doInjection(Object o) {
        Properties prop = new Properties();
        File file = new File("/home/andriylazorenko/IdeaProjects/Main/src/ArtCode/Temp/depend.properties");
        try {
            InputStream is = new FileInputStream(file);
            prop.load(is);
            prop.stringPropertyNames();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
