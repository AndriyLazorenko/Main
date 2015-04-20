package Perspektiva.hometask6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 07-Mar-15.
 */
public class MainCalc {
    public static void main(String[] args) throws IOException {
        Calc c = new Calc();
        while (true){
            c.mainmenu();
            System.out.println("If you want to exit, type exit");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String exit = "exit";
            String typo = br.readLine();
            if (typo.equals(exit)){
                break;
            }
        }
    }
}
