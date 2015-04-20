package Perspektiva.lesson18;

/**
 * Created by Master on 24-Mar-15.
 */
public class Main {
    public static void main(String[] args) {
        Holder h = new Holder();
        Producer pr1 = new Producer(h);
        Producer pr2 = new Producer(h);
        Producer pr3 = new Producer(h);
        Producer pr4 = new Producer(h);
        Producer pr5 = new Producer(h);
        Consumer c1 = new Consumer(h);
        Consumer c2 = new Consumer(h);
        Consumer c3 = new Consumer(h);
        Consumer c4 = new Consumer(h);
        Consumer c5 = new Consumer(h);
    }
}
