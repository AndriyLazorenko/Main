package Perspektiva.lesson2;

/**
 * Created by Master on 15-Jan-15.
 */
public class  Min {
    int one;
    int two;
    int three;
    public double change (int a, int b, int c) {
        double max = (a>b)?a:b;
        max = (max>c)?max:c;
        double min =(a<b)?a:b;
        min = (min<c)?max:c;
        double mid = (a!=min)&(a!=max)?a:(b!=min)&(b!=max)?b:c;
        return ((mid+max)/2);
    }
}
