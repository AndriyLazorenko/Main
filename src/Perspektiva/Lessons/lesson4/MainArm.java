package Perspektiva.Lessons.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 22-Jan-15.
 */
public class MainArm {
    public static void main (String [] args) throws IOException {
        Armstrong a = new Armstrong();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose task 1 or task 2");
        int num = Integer.parseInt(br.readLine());
        if (num ==1){
            a.one();
        }
        else a.two();
    }
}
