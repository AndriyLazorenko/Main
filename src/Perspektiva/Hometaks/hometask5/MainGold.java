package Perspektiva.Hometaks.hometask5;

import Perspektiva.Lessons.lesson5.RecurMas;
import Perspektiva.Lessons.lesson5.RecurOut;

import java.io.IOException;

/**
 * Created by Master on 01-Mar-15.
 */
public class MainGold {
    public static void main(String[] args) throws IOException {
        //Start with block responsible for creation and printout of an array
        RecurMas rm = new RecurMas();
        rm.numberGetter();
        rm.arraySetup();
        int arr [] = rm.recarray(rm.num,0);
        RecurOut ro = new RecurOut();
        ro.recursion(arr,0);
        //Proceed with sorting mechanism
        Gold gold = new Gold();
        gold.golden(arr,0,arr.length-1);
        ro.recursion(arr,0);
        System.out.println(gold.counter);
    }
}
