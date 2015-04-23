package Perspektiva.Hometaks.hometask6;

/**
 * Created by Master on 07-Mar-15.
 */
public class Fraction {
    RecursiveMethodsForFractions r = new RecursiveMethodsForFractions();
    public int[] addition (int[]a, int[]b){
        int NSD = r.NSD(a,b);
        int[] c = new int[2];
        if (a[1]==0 || b[1] == 0) {
            System.out.println("Motherfucker");
        }
        else {
               c[0]=(a[0]*b[1]/NSD)+(b[0]*a[1]/NSD);
               c[1]=a[1]*b[1]/NSD;
        }
        return c;
    }
    public String print (int []a){
        //System.out.println(a[0]+"/"+a[1]);
        String p = a[0]+"/"+a[1];
        return p;
    }
    public int [] substraction (int[]a,int[]b){
        int NSD = r.NSD(a,b);
        int []c = new int[2];
        if (a[1]==0 || b[1] == 0) {
            System.out.println("Motherfucker");
        }
        else {
            c[0]=(a[0]*b[1]/NSD)-(b[0]*a[1]/NSD);
            c[1]=a[1]*b[1]/NSD;
        }
        return c;
    }
    public int [] multiplication(int[]a,int[]b){
        int []c = new int[2];
        if (a[1]==0 || b[1] == 0) {
            System.out.println("Motherfucker");
        }
        else {
            c[0]=a[0]*b[0];
            c[1]=a[1]*b[1];
        }
        int NSD = r.NSD(c);
        c[0] = c[0]/NSD;
        c[1]=c[1]/NSD;
        return c;
    }
    public int[] division (int[]a,int[]b){
        int []c = new int[2];
        if (a[1]==0 || b[1] == 0) {
            System.out.println("Motherfucker");
        }
        else {
            c[0]=a[0]*b[1];
            c[1]=a[1]*b[0];
        }
        int NSD = r.NSD(c);
        c[0] = c[0]/NSD;
        c[1]=c[1]/NSD;
        return c;
    }
    public String toString(int[]a){
        String s = a[0]+"/"+a[1];
        return s;
    }
}
