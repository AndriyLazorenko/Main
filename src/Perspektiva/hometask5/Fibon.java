package Perspektiva.hometask5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 05-Mar-15.
 */
public class Fibon {
    int number;
    public int ask () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme number, biatch!");
        number = Integer.parseInt(br.readLine());
        if (number>35||number<1)
            return (int)(Math.random()*35);
        else return (number);
    }
    public int go (int i){
        if (i==1){
            return 1;
        }
        if (i==2){
            return 1;
        }
        else{
            return go(i-1)+go(i-2);
        }
    }
}
