package Perspektiva.Hometaks.hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 14-Jan-15.
 */
public class MainChange {
    public static void main(String [] args) throws IOException {
        Change c = new Change();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme 1");
        c.one = br.readLine();
        System.out.println("Gimme 2");
        c.two = br.readLine();
        c.eXch();
    }
}
