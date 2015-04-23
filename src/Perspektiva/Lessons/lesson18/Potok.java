package Perspektiva.Lessons.lesson18;

/**
 * Created by Master on 24-Mar-15.
 */
public class Potok {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new MyImpl();
        Thread thr = new Thread(r);
        MyThread th = new MyThread();
        MyThrx thrx = new MyThrx(th);
        //Thread thr = new Thread (th);
        //thr.setPriority(5);
        //thr.setDaemon(true);
        thr.start();
        thrx.start();
        th.start();
        thrx.join();
        thr.join();
        th.join();
        Thread.sleep(1);
        th.interrupt();
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}