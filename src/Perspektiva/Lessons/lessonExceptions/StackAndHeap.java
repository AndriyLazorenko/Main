package Perspektiva.Lessons.lessonExceptions;

/**
 * Created by Master on 18-Mar-15.
 */
public class StackAndHeap {
    static int j=0;
    static int k=0;
    public static int sof(int i){
        while (i>=0){
            j++;
            return i=sof(i+1)*sof(i+2);
        }
        return i;
    }
    public static void hof(int i){
        for (int l=i;l!=Integer.MAX_VALUE;l+=(int)(1.5*(l+1))) {
            int[] arr = new int[l];
            System.out.println(l);
        }
    }
    public static void main(String[] args) {
        try {
            sof(0);
        }
        catch (StackOverflowError error){
            System.out.println("StackOverflow!!! WE'RE DEAD!!!");
            System.out.println(j);
        }
        try {
            hof (0);
        }
        catch (StackOverflowError e){
            System.out.println("StackOverflow!!! WE'RE DEAD!!!");
        }
        catch (OutOfMemoryError error){
        System.out.println("HEAPOVERFLOW!!! We're good");
            System.out.println(k);
        }
    }
}
