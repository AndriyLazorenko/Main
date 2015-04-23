package Perspektiva.Lessons.lesson19;

/**
 * Created by Master on 26-Mar-15.
 */
public class Printer {

    public void print(String s) throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < 50; i++) {
                System.out.println(i + s);
            }
            this.notify();
            this.wait();
            for (int i = 50; i < 100; i++) {
                System.out.println(i + s);
            }
        }
    }
}
