package Perspektiva.Hometaks.hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 14-Jan-15.
 */
public class MainSchool {
    public static void main(String [] args) throws IOException {
        School s = new School();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Total number");
        s.total=Integer.parseInt(br.readLine());
        System.out.println("Gold");
        s.gold=Integer.parseInt(br.readLine());
        System.out.println("Lazy bitches");
        s.loh=Integer.parseInt(br.readLine());
        s.result();
    }
}
