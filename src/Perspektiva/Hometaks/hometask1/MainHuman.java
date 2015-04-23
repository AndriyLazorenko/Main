package Perspektiva.Hometaks.hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 14-Jan-15.
 */
public class MainHuman {
    public static void main (String [] args) throws IOException {
        Human h = new Human();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name");
        h.name=br.readLine();
        System.out.println("Surname");
        h.surname=br.readLine();
        System.out.println("Father's name");
        h.father=br.readLine();
        h.eat();
        h.sleep();
        h.work();
        h.sex();
    }
}
