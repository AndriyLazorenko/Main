package ArtCode.Lessons.lesson6;

/**
 * Created by Master on 10-May-15.
 */
public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(0);
        DebitLine p = new DebitLine(b);
        CreditLine c = new CreditLine(b);
        for (int i = 0; i <4 ; i++) {
            Thread th = new Thread(p);
            Thread th2 = new Thread(c);
            th.start();
            th2.start();
        }
    }
}
