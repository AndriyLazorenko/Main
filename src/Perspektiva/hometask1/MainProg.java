package Perspektiva.hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 14-Jan-15.
 */
public class MainProg {
    public static void main (String [] args) throws IOException {
        Programmer p =new Programmer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert name");
        p.name = br.readLine();
        System.out.println("Insert age");
        p.age = Integer.parseInt(br.readLine());
        p.print();
        p.receive();
    }
}
