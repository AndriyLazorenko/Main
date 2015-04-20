package Perspektiva.lesson3;

/**
 * Created by Master on 20-Jan-15.
 */
public class Array {
    public Array (int a) {this.num = a;}
        private int num;
    public int getNum () {
        return num;
    }
    public int [] create() {
        int[] b = new int[this.getNum()];
        for (int i = 0; i < num; i++) {
            b[i] = (int) (Math.random() * 100);
        }
        return b;
    }
    public long one(int[] c, int[] d) {
        long before = System.nanoTime();
        for (int i = 0; i < num; i++) {
            c[i] = d[i];
        }
        long res = System.nanoTime() - before;
        System.out.println(res);
        return res;
    }

    public long two(int[] c, int[] d) {
        long before = System.nanoTime();
        System.arraycopy(d, num, c, num, 0);
        long res = System.nanoTime() - before;
        System.out.println(res);
        return res;
        /*for (int i = 0; i < num; i++) {
            System.out.print(c[i] - d[i]);
        }
        System.out.println("\n");*/
    }
}

