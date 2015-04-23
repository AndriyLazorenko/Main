package Perspektiva.Lessons.lesson5;

/**
 * Created by Master on 27-Jan-15.
 */
public class RecurOut {
    public void recursion (int [] a,int i) {
        if (i==a.length) {
            System.out.println("");
            return;
        }
        else {
            System.out.print(a[i] + " ");
            recursion(a,i+1);
        }
        }
    public void recursion (int[][]a,int i, int j){
        if (i==a.length){
            System.out.print("");
        }
        else {
            if (j==a.length){
                System.out.println();
            }
            else {
                System.out.print(a[i][j]+" ");
                recursion(a,i,j+1);
                return;
            }
            recursion(a,i+1,j-a.length);
            return;
        }
    }
    }
//if (a.length==1) return;
//System.out.println(Arrays.toString(a));
