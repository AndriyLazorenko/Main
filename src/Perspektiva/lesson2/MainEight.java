package Perspektiva.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 15-Jan-15.
 */
public class MainEight {
    public static void main (String [] args) throws IOException {
        Eight t = new Eight();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme 1");
        t.one = Integer.parseInt(br.readLine());
        System.out.println("Gimme 2");
        t.two = Integer.parseInt(br.readLine());
        System.out.println("Gimme 3");
        t.three = Integer.parseInt(br.readLine());
        System.out.println("Gimme 4");
        t.four = Integer.parseInt(br.readLine());
        System.out.println("Gimme 5");
        t.five = Integer.parseInt(br.readLine());
        System.out.println("Gimme 6");
        t.six = Integer.parseInt(br.readLine());
        System.out.println("Gimme 7");
        t.seven = Integer.parseInt(br.readLine());
        System.out.println("Gimme 8");
        t.eight = Integer.parseInt(br.readLine());
        t.minmax();
    }
}
