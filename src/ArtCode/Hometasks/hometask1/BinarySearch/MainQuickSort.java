package ArtCode.Hometasks.hometask1.BinarySearch;

import java.io.IOException;

public class MainQuickSort {
    public static void main(String[] args) throws IOException {
        //Start with block responsible for creation and printout of an array
        RecurMas rm = new RecurMas();
        rm.numberGetter();
        rm.arraySetup();
        int arr [] = rm.recarray(0);
        RecurOut ro = new RecurOut();
        ro.recursion(arr,0);
        //Proceed with sorting mechanism
        Gold gold = new Gold();
        gold.golden(arr,0,arr.length-1);
        ro.recursion(arr,0);
        System.out.println(gold.counter);
    }
}
