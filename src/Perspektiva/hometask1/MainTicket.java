package Perspektiva.hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 14-Jan-15.
 */
public class MainTicket {
    public static void main (String[] args) throws IOException {
        Ticket t=new Ticket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("From");
        t.from=br.readLine();
        System.out.println("To");
        t.to=br.readLine();
        System.out.println("Time of Departure");
        t.timefrom=br.readLine();
        System.out.println("Time of Arrival");
        t.timeto=br.readLine();
        System.out.println("Price");
        t.price=Float.parseFloat(br.readLine());
        t.printit();
    }
}
