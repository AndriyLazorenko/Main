package ArtCode.Lessons.lesson6;

/**
 * Created by Master on 10-May-15.
 */
public class DebitLine implements Runnable{
    private BankAccount b;

    public DebitLine(BankAccount b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            b.put(1);
            System.out.println(b.getCash());
        }
    }

}
