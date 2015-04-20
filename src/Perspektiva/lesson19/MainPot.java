package Perspektiva.lesson19;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Master on 26-Mar-15.
 */
public class MainPot {
    public static void main(String[] args) throws InterruptedException {
        Printer p = new Printer();
        Potock one = new Potock(p,"Motherfucker!!!");
        Potock two = new Potock(p,"WHYDOYOUWANNAKILLME???");
        Executor exec = Executors.newCachedThreadPool();
        exec.execute(one);
        exec.execute(two);
        Thread.sleep(1000);
    }
}
