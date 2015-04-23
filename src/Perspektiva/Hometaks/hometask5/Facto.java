package Perspektiva.Hometaks.hometask5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 05-Mar-15.
 */
public class Facto {
    public int ask () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme a number, biatch!");
        return(Integer.parseInt(br.readLine()));
    }
    public int recfac (int i){
        if (i==1){
            return i;
        }
        else {
            return (i*recfac(i-1));
        }
    }
}
