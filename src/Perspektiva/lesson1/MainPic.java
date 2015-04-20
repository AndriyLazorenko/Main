package Perspektiva.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 13-Jan-15.
 */
public class MainPic {
    public static void main(String[]args) throws IOException {
        Picture p = new Picture();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert a bloody character");
        p.Сharacter=br.readLine();
        p.drawL();
        System.out.println("\n");
        p.dravt();
    }
}
