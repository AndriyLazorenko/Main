package Perspektiva.hometask5;

import Perspektiva.lesson5.RecurOut;

import java.io.IOException;

/**
 * Created by Master on 28-Feb-15.
 */
public class MainDoubleArr {
    public static void main(String[] args) throws IOException {

        //Сооружаем простеньний двухмерный массив циклами, как мы умеем

        /*DoubleMas d = new DoubleMas();
        d.create();
        d.out();
        System.out.println();*/

        //После тестировки рекурсии, отключаем его и включаем рекурсивный двухмерный массив

        RecDoubleArr rda = new RecDoubleArr();
        rda.setSize();
        rda.setDoubleArray();
        rda.createArray(0,0);

        //сама рекурсия и алгоритмы

        RecurOut r = new RecurOut();
        r.recursion(rda.doubleArray,0,0);

        //Все работает. Всем спасибо, все свободны =)
    }
}
