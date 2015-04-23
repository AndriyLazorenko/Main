package Perspektiva.Hometaks.hometask5;

import Perspektiva.Lessons.lesson5.Murderer;
import Perspektiva.Lessons.lesson5.RecurMas;
import Perspektiva.Lessons.lesson5.RecurOut;

import java.io.IOException;

/**
 * Created by Master on 01-Mar-15.
 */
public class TestMerger {
    public static void main(String[] args) throws IOException {
        RecurMas rm = new RecurMas();
        rm.numberGetter();
        rm.arraySetup();
        int arr [] = rm.recarray(rm.num,0);
        RecurOut ro = new RecurOut();
        ro.recursion(arr,0);
        Murderer m = new Murderer();
        arr = m.merge(arr);
        ro.recursion(arr,0);
    }
}
