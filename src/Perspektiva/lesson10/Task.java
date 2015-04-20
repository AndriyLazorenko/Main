package Perspektiva.lesson10;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Master on 12-Feb-15.
 */
public class Task {
    public static void main (String [] args){
        Calendar c1, c2 = new GregorianCalendar();
        c1 = Calendar.getInstance();
        c2.set(Calendar.DATE, 7);
        c2.set(Calendar.YEAR,1980);
        c2.set(Calendar.MONTH,9);
        //System.out.println(c2.get(Calendar.DATE));
        for (int i=0; i<364;i++){
            if (c2.get(Calendar.MONTH)==c1.get(Calendar.MONTH)) {
                if (c2.get(Calendar.DATE) == c1.get(Calendar.DATE)) {
                    System.out.println("HAPPY BIRTHDAY!!!!");
                }
            }
            System.out.println("Boring day "+(i+1));
            c1.add(Calendar.DATE,1);
        }
    }
}
