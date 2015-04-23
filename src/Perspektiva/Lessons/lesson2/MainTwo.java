package Perspektiva.Lessons.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 15-Jan-15.
 */
public class MainTwo {
    public static void main (String [] args) throws IOException {
        Two t = new Two();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme 1");
        t.one = Integer.parseInt(br.readLine());
        System.out.println("Gimme 2");
        t.two = Integer.parseInt(br.readLine());
        t.minmax();
    }
}
