package ArtCode.Lessons.lesson8;

import java.io.*;
import java.util.Properties;

/**
 * Created by Master on 16-May-15.
 */
public class MainProp {
    public static void main(String[] args) throws IOException {
        Properties pr = new Properties();
        File file = new File("G://Properties.txt");
        FileWriter fw = new FileWriter(file);
        pr.store(fw,"no comments");
        System.out.println(pr.getProperty("Length"));
        FileReader fr = new FileReader(file);
        pr.load(fr);
    }
}
