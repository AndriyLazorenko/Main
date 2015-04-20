package Perspektiva.hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 17-Jan-15.
 */
public class Quad {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void solve () throws IOException {
        System.out.println("Equation of type ax^2+bx+c=0");
        System.out.println("Insert a:");
        double a = Integer.parseInt(br.readLine());
        System.out.println("Insert b:");
        double b = Integer.parseInt(br.readLine());
        System.out.println("Insert c:");
        double c = Integer.parseInt(br.readLine());
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("Motherfucker!!!");
        }
        else if (d == 0) {
            double x = (-b) / (2 * a);
            System.out.printf("Solution to the problem is %d", x);
        }
        else {
            double x1, x2,lol;
            lol=Math.sqrt(d);
            System.out.println(lol);
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            // Alternative solutions
            // System.out.printf("%f %f",x1,x2);
            System.out.printf("Solutions to the problem are "+x1+" and "+x2);
        }
    }
}
