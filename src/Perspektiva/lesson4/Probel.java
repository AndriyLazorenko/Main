package Perspektiva.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 22-Jan-15.
 */
public class Probel {
    public void method() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme String, motherfucker!!!");
        String s = br.readLine();
        String s1= s.replace(" ","_");
        System.out.println(s1);
    }
}
