package ArtCode.Lessons.lesson4;

import java.io.*;

/**
 * Created by Master on 26-Apr-15.
 */
public class TestReadFromFile {
    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("G:\\MegaDrive\\Programming\\Documents ArtCode\\new.txt");
            StringBuilder stringBuilder = new StringBuilder();
            int b = 0;
            while (b!=-1) {
                    b = is.read();
                if (b!=-1) {
                    char c = (char) b;
                    stringBuilder.append(c);
                }
            }
            System.out.println(stringBuilder);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
