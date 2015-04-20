package Perspektiva.lesson10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Master on 12-Feb-15.
 */
public class Data {
    public static void main (String [] args) throws ParseException {
        //Класс дата, методы
        Date d = new Date();
        long newd = d.getTime()+(1000*60*60*24*5);
        d.setTime(newd);
        System.out.println(d);
        // Класс SDF
        String s = "dd.MM.yyyy год HH:mm:ss";
        SimpleDateFormat e = new SimpleDateFormat(s,Locale.getDefault());
        System.out.println(e.format(d));
        // Поменять конкретный месяц
        String f = e.format(d);
        String [] g = f.split("\\.");
        for(int i=0; i<g.length;i++){
            System.out.println(g[i]);
        }
        int h = Integer.parseInt(g[1]);
        //Проверка на 12 месяц
        if (h!=12){
            h=++h;
        }
        else h=1;
        System.out.println(h);
        //Переводим обратно в стрингу
        String k;
        if (h<10){
            k = "0"+h;
        }
        else k = h+"";
        System.out.println(k);
        String j = g[0].concat("."+k+"."+g[2]);
        //Метод из стринга в дату
        System.out.println(j);
        System.out.println(e.parse(j));
        /*System.out.println(h);

        String [] g = f.split(".");
        for(int i=0; i<g.length;i++){
            System.out.println(g[i]);
        }*/
    }
}
