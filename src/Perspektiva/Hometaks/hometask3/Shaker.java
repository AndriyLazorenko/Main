package Perspektiva.Hometaks.hometask3;

/**
 * Created by Master on 25-Feb-15.
 */
public abstract class Shaker extends Puzyrjok {
    public static void sortMass (int[]a) {
        //Реализована сортировка Шейкериал
        int left =0; int right = a.length-1;
        do {
            for (int i=left;i<right;i++){
                if (a[i]>a[i+1]) {
                    a[i] = a[i] + a[i + 1];
                    a[i + 1] = a[i] - a[i + 1];
                    a[i] = a[i] - a[i + 1];
                }
            }
            right --;
            for (int i = right; i>left;i--){
                if (a[i]<a[i-1]) {
                    a[i] = a[i] + a[i - 1];
                    a[i - 1] = a[i] - a[i - 1];
                    a[i] = a[i] - a[i - 1];
                }
            }
            left ++;
        } while (left<=right);
    }
}
