package Perspektiva.Lessons.lesson10;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by Master on 12-Feb-15.
 */
public class Kalendar {
    public static void main (String [] args) {
        Calendar g = new GregorianCalendar(2004,12,5,12,00,00);
        //Date d = g.getTime();
        Calendar c = Calendar.getInstance();


        System.out.println(c.getDisplayName(2,Calendar.LONG_FORMAT,Locale.getDefault()));
        //-----!!!-----//
        Locale.setDefault(Locale.ENGLISH);
        c.add(Calendar.DATE,14);
        Date d = c.getTime();
        System.out.println(d);
        c.getFirstDayOfWeek();
        //Calendar.DAY_OF_MONTH
        //System.out.println(c.get(Calendar.DATE));

    }
}
