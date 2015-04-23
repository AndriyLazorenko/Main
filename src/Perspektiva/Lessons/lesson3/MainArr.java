package Perspektiva.Lessons.lesson3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 20-Jan-15.
 */
public class MainArr {
    public static void main (String [] args) throws IOException {
        int [] i; int [] j;
        List l = new ArrayList();
        Array a = new Array(10);
        i = a.create();
        j = a.create();
        a.one(i, j);
        a.two(i,j);
        Array b = new Array(100);
        i = b.create();
        j = b.create();
        l.add(b.one(i, j));
        l.add(b.two(i, j));
        Array с = new Array(1000);
        i = с.create();
        j = с.create();
        l.add(с.one(i, j));
        l.add(с.two(i, j));
        Array d = new Array(10000);
        i = d.create();
        j = d.create();
        l.add(d.one(i, j));
        l.add(d.two(i, j));
        Array e = new Array(100000);
        i = e.create();
        j = e.create();
        l.add(e.one(i, j));
        l.add(e.two(i, j));
        //Table building
        PrettyTable p = new PrettyTable();
        p.pretty(l);
    }
}
