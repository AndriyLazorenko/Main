package Perspektiva.Hometaks.hometask5;

import Perspektiva.Lessons.lesson5.RecurMas;
import Perspektiva.Lessons.lesson5.RecurOut;

import java.io.IOException;

/**
 * Created by Master on 28-Feb-15.
 */
public class TestArraycopy {
    public static void main(String[] args) throws IOException {
        RecurMas rm = new RecurMas();
        rm.numberGetter();
        rm.arraySetup();
        int arr [] = rm.recarray(rm.num,0);
        RecurOut ro = new RecurOut();
        ro.recursion(arr,0);
        /*
        for (int i=0; i<arr.length;i++)
            System.out.print(arr[i]+"bitch");

        */
        int arr1[] = new int[arr.length/2];
        int arr2[] = new int[arr.length - arr.length/2];
        System.arraycopy(arr, 0, arr1, 0, arr.length / 2);
        //merge(mas1);
        System.arraycopy(arr, arr.length / 2, arr2, 0, arr.length - arr.length / 2);
        //merge(mas2);
        ro.recursion(arr1,0);
        ro.recursion(arr2,0);
    }
}
