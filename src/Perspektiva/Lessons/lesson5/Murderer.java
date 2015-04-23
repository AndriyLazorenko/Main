package Perspektiva.Lessons.lesson5;

/**
 * Created by Master on 30-Jan-15.
 */
public class Murderer {
    public int[] merge (int[]m) {
        int mas1[] = new int [m.length / 2];
        int mas2[] = new int [m.length - m.length / 2];
        if (m.length == 1) {
            System.out.print("");
        }
        else {
                System.arraycopy(m, 0, mas1, 0, m.length / 2);
                merge(mas1);
                System.arraycopy(m, m.length / 2, mas2, 0, m.length - m.length / 2);
                merge(mas2);
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<mas1.length&&j<mas2.length){
            if (mas1[i]<mas2[j]){
                m[k]=mas1[i];
                i++;}
            else {
                m[k]=mas2[j];
                j++;
            }
            k++;
        }
        //
        if (mas1.length!=0&&mas2.length!=0) {
            if (i == mas1.length) {
                while (j < mas2.length) {
                    m[k] = mas2[j];
                    k++;
                    j++;
                }
            } else {
                while (i < mas1.length) {
                    m[k] = mas1[i];
                    k++;
                    i++;
                }
            }
        }
        return m;
    }
}
