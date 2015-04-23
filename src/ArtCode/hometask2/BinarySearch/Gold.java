package ArtCode.hometask2.BinarySearch;

public class Gold {
    int counter = 0;
    public int[] golden (int[]a,int low, int high){
        int gold = a[high];
        int l = low;
        int h = high;
        while (l < h){
            if (a[l] <= gold) {
                l++;
            }
            else if (a[h] >= gold) {
                h--;
            }
            else {
                a[l] = a[l] + a[h];
                a[h] = a[l] - a[h];
                a[l] = a[l] - a[h];
            }
        }
        a[high] = a[h];
        a[h] = gold;
        System.out.println("Low boundary is " + l);
        System.out.println("High boundary is "+h);
        counter++;
        if (l != high) {
            golden(a, l, high);
        }
        if (h != low) {
            golden(a, low, h-1);
        }
        return a;
    }
}