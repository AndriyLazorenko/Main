package Perspektiva.Hometaks.hometask6;

/**
 * Created by Master on 20-Mar-15.
 */
public class Array {
    private int[] arr;
    public void randomArrCreate (int i) {
        arr = new int[i];
        for (int j = 0; j<i;j++){
            arr[j] = (int)(Math.random()*100);
        }
    }
    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public int min (int[]a) {
        int minVal = a[0];
        for (int i:a){
            if (i<minVal)
                minVal = i;
        }
        return minVal;
    }
    public int max (int[]a){
        int maxVal = a[0];
        for (int i:a){
            if (i>maxVal){
                maxVal = i;
            }
        }
        return maxVal;
    }
    public void fillRandom (int left, int right){
        for (int i = left; i<right; i++){
            arr[i] = (int)(Math.random()*100);
        }
    }
    public void print (int[]a) {
        System.out.print("{");
        for (int i=0; i<a.length-1;i++){
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1]);
        System.out.println(" }");
    }
    public void sortPartly (int left, int right) {
        int golden = arr[right];
        int l = left;
        int r = right;
        while (l<r){
            if (arr[l]<=golden){
                l++;
            }
            else if (arr[r]>=golden){
                r--;
            }
            else {
                arr[l] = arr[l]+arr[r];
                arr[r] = arr[l] - arr[r];
                arr[l] = arr[l] - arr[r];
            }
        }
        arr[right] = arr[r];
        arr[r] = golden;
        if (l!=right){
            sortPartly(l,right);
        }
        if (r!=left){
            sortPartly(left,r-1);
        }
    }
    public void resize (int newSize){
        int[]ar = new int[arr.length];
        System.arraycopy(arr,0,ar,0,arr.length);
        arr = new int[newSize];
        System.arraycopy(ar,0,arr,0,ar.length);
        this.fillRandom(ar.length,arr.length);
    }
}
