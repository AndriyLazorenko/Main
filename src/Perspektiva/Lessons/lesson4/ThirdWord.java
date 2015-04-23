package Perspektiva.Lessons.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 22-Jan-15.
 */
public class ThirdWord {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void method () throws IOException {
        System.out.println("Gimme text, bitch!!!");
        String str = br.readLine();
        String [] strm = str.split(" ");
        if (strm.length<3){
            System.out.println("Motherfucker!!!");
        }
        else {
            //System.out.println(strm[strm.length - 3]);
            System.out.println(str.lastIndexOf(strm[strm.length - 3]));
        }
    }
}
