package Perspektiva.Hometaks.hometask6;

/**
 * Created by Master on 07-Mar-15.
 */
public class RecursiveMethodsForFractions {
    public int NSD (int[]a,int[]b){
        if (b[1] ==0){
            int i = (int)(Math.random()*3+1);
            switch (i){
                case 1: {
                    System.out.println("SON_OF_A_BITCH!!!");
                }
                case 2: {
                    System.out.println("Fuck you! PNH!");
                }
                case 3: {
                    System.out.println("Error occured! Division by zero! Is that a fucking fraction? NO, BIATCH!");
                }
            }
            return 1;
        }
        else {
            int i = a[1]%b[1];
            return NSD(b[1],i);
        }
    }
    public int NSD (int a,int b){
        if (b==0) return a;
        int i = a%b;
        return NSD(b,i);
    }
    public int NSD (int[]a){
        int i = a[0]%a[1];
        return NSD (a[1],i);
    }
}
