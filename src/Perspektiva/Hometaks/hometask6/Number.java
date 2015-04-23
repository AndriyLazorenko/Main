package Perspektiva.Hometaks.hometask6;

/**
 * Created by Master on 07-Mar-15.
 */
public class Number {
    public double addition (double a, double b) {
        return (a+b);
    }
    public double multiplication (double a, double b){
        return (a*b);
    }
    public double substraction (double a, double b){
        return (a-b);
    }
    public double division (double a, double b){
        if (b==0){
            System.out.println("Motherfucker! PNH!");
            return 0;
        }
        else return (a/b);
    }
    public double power (double a, double b) {
        return (Math.pow(a,b));
    }
    public int fact (int a){
        if (a==1) return a;
        else return a*fact(a-1);
    }
    public int leftover (int a, int b){
        return a%b;
    }
    }
