package Perspektiva.Lessons.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 22-Jan-15.
 */
public class Armstrong {
    String num,range1,range2;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void one () throws IOException {
        System.out.println("Gimme number");
        num = br.readLine();
        Armcheck a = new Armcheck();
        a.check(num);
    }
    public void two () throws IOException {
        System.out.println("Gimme range beginning range");
        range1=br.readLine();
        System.out.println("Gimme range ending rage!!!");
        range2=br.readLine();
        int irange1 = Integer.parseInt(range1);
        int irange2 = Integer.parseInt(range2);
        String [] str = new String[irange2-irange1];
        String answer = new String("");
        for (int i = 0; i<(irange2-irange1);i++){
            str[i]=Integer.toString(irange1+i);
            Armcheck a = new Armcheck();
            int b = a.check(str[i]);
            if (b!=0){
                answer=answer+" "+b;
            }
        }
        System.out.println(answer);
    }



}
