package Perspektiva.lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Master on 24-Feb-15.
 */
public class Oi {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.lesson13\\New.txt");
        byte [] bytes = new byte[fis.available()];
        fis.read(bytes);
        char [] c = new char[bytes.length];
        String s = null;
        for (int i =0; i<bytes.length;i++){
            System.out.println((char)bytes[i]);
            c[i]=(char)bytes[i];
        }
        s=c.toString();
        System.out.println(s);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.lesson13\\New2.txt");
        fos.write(bytes);
    }
}
