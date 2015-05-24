package ArtCode.Hometasks.hometask1.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecurMas {

    private int num;
    private int [] ret;

    //Gimme an array, motherfucker!!!

    public void numberGetter () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme number of elements, you!!!");
        int num = Integer.parseInt(br.readLine());
        this.setNum(num);
    }
    public void arraySetup(){
        this.setRet(new int[getNum()]);
    }
    public int[] recarray (int i){
        if (i!= getRet().length) {
            getRet()[i] = (int) (Math.random() * 100);
            recarray (i + 1);
        }
        return getRet();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[] getRet() {
        return ret;
    }

    public void setRet(int[] ret) {
        this.ret = ret;
    }
}
