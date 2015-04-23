package Perspektiva.Hometaks.hometask5;

import java.io.IOException;

/**
 * Created by Master on 05-Mar-15.
 */
public class MainFact {
    public static void main(String[] args) throws IOException {
        Facto facto = new Facto();
        System.out.println(facto.recfac(facto.ask()));
    }
}
