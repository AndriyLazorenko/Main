package Perspektiva.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 15-Jan-15.
 */
public class MainBox {
    public static void main (String [] args) throws IOException {
        Box b = new Box();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Length");
        int length = Integer.parseInt(br.readLine());
        System.out.println("Width");
        int width = Integer.parseInt(br.readLine());
        System.out.println(b.fit(length,width));
    }
}
