package Perspektiva.hometask3;

/**
 * Created by Master on 25-Feb-15.
 */
public class Puzyrijok extends Sortir{

    public void puz () {
        for (int i = 0; i<mas.length;i++){
            if (mas[i]<mas[i+1]){
                mas[i] = mas [i]+mas[i+1];
                mas[i+1]= mas[i]-mas[i+1];
                mas[i] = mas[i]-mas[i+1];
            }
        }

        //Выводим отсортированный массив

        RecurOut r = new RecurOut();
        r.recursion(mas,0);
    }
}
