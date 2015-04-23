package Perspektiva.Lessons.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 15-Jan-15.
 */
public class MainMin {
    public static void main (String [] args) throws IOException {
        Min m = new Min();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert number 1");
        m.one = Integer.parseInt(br.readLine());
        System.out.println("Insert number 2");
        m.two = Integer.parseInt(br.readLine());
        System.out.println("Insert number 3");
        m.three = Integer.parseInt(br.readLine());
        System.out.println(m.change(m.one,m.two,m.three));
    }
}
