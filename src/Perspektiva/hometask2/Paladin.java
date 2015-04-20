package Perspektiva.hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 17-Jan-15.
 */
public class Paladin {
    public void bringlight () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose string(1), massive(2), if(3)");
        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1 :
                Palstring s = new Palstring();
                s.method();
                break;
            case 2 :
                Palmas m = new Palmas();
                m.method();
                break;
            case 3 :
                Palif i = new Palif();
                i.method();
                break;
            default:
                System.out.println("What the fuck did you do?! LAMER!!!");
        }
    }
}
