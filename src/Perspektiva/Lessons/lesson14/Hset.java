package Perspektiva.Lessons.lesson14;

import java.util.*;

/**
 * Created by Master on 26-Feb-15.
 */
public class Hset {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(13);
        set.add(1);
        set.add(4);
        set.add(7);
        set.add(9);
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("");

        //Next

        Set<Integer> set2 = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        set2.add(13);
        set2.add(1);
        set2.add(4);
        set2.add(7);
        set2.add(9);
        Iterator<Integer> iter2 = set2.iterator();
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }
        System.out.println("");

        //
    }
}
