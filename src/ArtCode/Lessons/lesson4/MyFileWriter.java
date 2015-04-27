package ArtCode.Lessons.lesson4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Master on 26-Apr-15.
 */
public class MyFileWriter {
    public static void writeToFile(String path, String data){
        try {
            Writer wr = new FileWriter(path);
            wr.write(data);
            wr.flush();
            wr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
