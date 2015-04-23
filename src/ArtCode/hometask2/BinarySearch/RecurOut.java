package ArtCode.hometask2.BinarySearch;

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
}
//if (a.length==1) return;
//System.out.println(Arrays.toString(a));
