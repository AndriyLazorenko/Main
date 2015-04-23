package Perspektiva.Lessons.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 22-Jan-15.
 */
public class Symbol {
    public void method() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme String, motherfucker!!!");
        String s = br.readLine();
        String s1= s.replace(","," ");
        String s2 = s1.replace("  "," ");
        String [] st = s2.split(" ");
        String task="";
        for (int i = 1; i<st.length; i++){
            task+= st[i].charAt(0)+"";
        }
        System.out.println(task);
        }
}
