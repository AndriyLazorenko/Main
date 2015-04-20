package Perspektiva.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 27-Jan-15.
 */
public class ArrayRec {
    public static void rec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme number of elements, you sonofabitch!!!");
        int num = Integer.parseInt(br.readLine());
        int[] mas1 = new int[num];
        for (int i = 0; i < num; i++) {
            mas1[i] = (int) (Math.random() * 100);
            //System.out.print(mas1[i] + " ");
        }
        RecurOut r = new RecurOut();
        r.recursion(mas1, 0);
        /*if (a.length==1) {
            System.out.println(a[0]);
        }
        else System.arraycopy(a,b,);
        }*/
    }
}
