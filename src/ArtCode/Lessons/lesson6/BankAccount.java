package ArtCode.Lessons.lesson6;

/**
 * Created by Master on 10-May-15.
 */
public class BankAccount {

    public BankAccount(int cash){
        this.cash = cash;
    }
    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    private int cash = 0;

    public synchronized void put(int money){
        setCash(getCash() + money);
        while (getCash()!=0){
            this.notifyAll();
            try {
                this.wait();
                System.out.println("Put asleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AWAKEN!!! (triggered by put)");
        }
    }

    public synchronized void withdraw(int money){
        while (cash-money<0) {
            try {
                System.out.println("Withdraw asleep");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setCash(getCash() - money);
        notifyAll();
        System.out.println("All AWAKEN!!! (triggered by withdraw)");
    }
}
