package ArtCode.Lessons.lesson4;

import java.io.File;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Master on 26-Apr-15.
 */
public class Find {
    static String find (File dir, String key) {
        if(dir.isFile()) {
            return (dir.getName().contains(key) ? dir.getAbsolutePath() + "\n" : "");
        }
        else {
            String res = "";
            File () c
        }
    }
}
