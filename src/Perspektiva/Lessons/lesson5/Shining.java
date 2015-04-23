package Perspektiva.Lessons.lesson5;

import java.io.IOException;

/**
 * Created by Master on 27-Jan-15.
 */
public class Shining {
    int [] mas;
    public void shine () throws IOException {

        //Задаем случайный одномерный массив размера, заданного пользователем

        RecurMas rm = new RecurMas();
        rm.numberGetter();
        rm.arraySetup();
        mas = rm.recarray(rm.num,0);

        //Выводим полученный массив

        RecurOut r = new RecurOut();
        r.recursion(mas,0);

        //Делаем щаманство с разбитием массива на несколько подмассивов

        Murderer m = new Murderer();
        mas = m.merge(mas);
        r.recursion(mas,0);
    }
}

