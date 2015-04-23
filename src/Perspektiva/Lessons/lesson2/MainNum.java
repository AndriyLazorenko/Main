package Perspektiva.Lessons.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 15-Jan-15.
 */
public class MainNum {
    public static void main (String [] args) throws IOException {
        Numbers n = new Numbers();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert a number");
        n.one = Integer.parseInt(br.readLine());
        System.out.println(n.method(n.one));
    }
}
