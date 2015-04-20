package Perspektiva.lesson15;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Master on 03-Mar-15.
 */
public class MainCol {
    public static void main(String[] args) {
        Collect<String> collect = new Collect<String>();
        collect.add("sadflk");
        collect.add("blahblahblah");
        collect.add("Zsalzxclz");
        Iterator iter = collect.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        Collect<String> collect1= new Collect<String>();
        //выебывается
        collect1.addAll((Collection<String>) collect);
        //Закончить как дз
        collect1.add(3, "sdfsdfsf");
        collect1.set(4, "Abababab");
        collect1.remove("sadflk");
        collect1.contains("blahblahblah");
        Iterator iterator = collect1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
