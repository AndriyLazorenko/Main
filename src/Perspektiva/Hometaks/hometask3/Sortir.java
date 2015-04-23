package Perspektiva.Hometaks.hometask3;

import java.io.IOException;

/**
 * Created by Master on 24-Feb-15.
 */
public class Sortir {
    int [] mas;
    public void method () throws IOException {

        //Задаем случайный одномерный массив размера, заданного пользователем

        RecurMas rm = new RecurMas();
        rm.numberGetter();
        rm.arraySetup();
        mas = rm.recarray(rm.num,0);

        //Выводим случайный одномерный массив

        RecurOut r = new RecurOut();
        r.recursion(mas,0);
    }
}
