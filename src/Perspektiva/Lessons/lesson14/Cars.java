package Perspektiva.Lessons.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Master on 26-Feb-15.
 */
public class Cars {
    public static void main(String[] args) throws IOException {
        System.out.println("Gimme field, motherfucker!!!! Choose a field (1-3)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set set = null;
        int i = Integer.parseInt(br.readLine());
        /*switch (i) {
            case 1:
        }*/
        if (i!=1&&i!=2&&i!=3){
            System.out.println("MOTHERFUCKER!!!");
        }
        else if (i==1) {
            set = new TreeSet(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price;
            }
        });
        }
        else if (i==2){
            set = new TreeSet(new Comparator<Car>() {
                @Override
                public int compare(Car o1, Car o2) {
                    return o1.year - o2.year;
                }
            });

        }
        else {
            set = new TreeSet(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.colour.compareTo(o2.colour);
            }
        });

        }



        set.add(new Car(1998,2131,"colour"));
        set.add(new Car(1892,21993,"comps"));
        set.add(new Car(18992,993,"comaps"));
        Iterator iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
