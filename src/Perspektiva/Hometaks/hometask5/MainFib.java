package Perspektiva.Hometaks.hometask5;

import java.io.IOException;

/**
 * Created by Master on 05-Mar-15.
 */
public class MainFib {
    public static void main(String[] args) throws IOException {
        Fibon f = new Fibon();
        int a = f.ask();
        //System.out.println(f.go(a));
        int [] b = new int[a];
        for (int i = 0; i<b.length; i++){
            b[i] = f.go(i+1);
        }
        for (int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
}
