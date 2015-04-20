package Perspektiva.lesson17;

import java.io.File;

/**
 * Created by Master on 17-Mar-15.
 */
public class Files {
        public static void main(String[] args) {
        File f = new File ("G:\\Programming\\Assignment\\What dafuq\\PNH\\New2.txt");
            File fileOfControl = new File ("G:\\Programming");
            Recursive r = new Recursive();
            //r.recursive(f);
            r.recursiveForce(fileOfControl,0);
    }
}
