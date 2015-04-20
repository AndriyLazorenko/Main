package Perspektiva.hometask6;

/**
 * Created by Master on 07-Mar-15.
 */
public class TestFraction {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        int [] a = new int[2];
        a[0] = 2;
        a[1] = 30;
        int [] b = new int[2];
        b[0] = 5;
        b[1] = 40;
        f.print(a);
        f.print(b);
        f.print(f.addition(a,b));
        f.print(f.substraction(a,b));
        f.print(f.multiplication(a,b));
        f.print(f.division(a,b));
        System.out.println(f.toString(a));
    }
}
