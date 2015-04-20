package Perspektiva.hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 18-Jan-15.
 */
public class Palif {
    public void method () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert your palindrome here");
        int pal = Integer.parseInt(br.readLine());
        // Counting number of digits
        int num = 0;
        while (pal != 0){
            pal =(int) pal/10;
            num++;
        }
        //Continue from here!!!
        System.out.println("Not possible. Fuck it with a horse. Have a nice day!");
    }
}
