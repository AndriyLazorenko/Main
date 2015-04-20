package Perspektiva.hometask3;

/**
 * Created by Master on 25-Feb-15.
 */
public abstract class Wstawka extends Puzyrjok {
    public static void sortMass (int[]a) {
        // Реализована сортировка вставками.
        for(int i = 1; i < a.length; i++){
            int currElem = a[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && a[prevKey] > currElem){
                a[prevKey+1] = a[prevKey];
                a[prevKey] = currElem;
                prevKey--;
            }
        }
    }
}
