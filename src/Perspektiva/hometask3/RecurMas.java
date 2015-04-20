package Perspektiva.hometask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 29-Jan-15.
 */
public class RecurMas {
    //Gimme an array, motherfucker!!!
    int num;
    public void numberGetter () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme number of elements, you!!!");
        int num = Integer.parseInt(br.readLine());
        this.num = num;
    }
    int [] ret;
    public void arraySetup(){
        this.ret = new int[num];
    }
    public int[] recarray(int a, int i){
        if (i!=ret.length) {
            ret[i] = (int) (Math.random() * 100);
            recarray(a, i + 1);
        }
        return ret;
    }
}
