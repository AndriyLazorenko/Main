package Perspektiva.Lessons.lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Master on 24-Feb-15.
 */
public class Sort {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintWriter pw = new PrintWriter("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.Lessons.lesson13\\New.txt",true);
        List a = new ArrayList();
        List b = new ArrayList();
        Scanner sc1 = new Scanner(new FileInputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.Lessons.lesson13\\sort"));
        Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.Lessons.lesson13\\sort2"));
        while (sc1.hasNext()==true){
            a.add(sc1.nextInt());
        }
        while (sc2.hasNext()==true){
            b.add(sc2.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b);
        System.out.println(a);
        System.out.println(b);
        List c = new ArrayList();
        //Реализовать сортировку двух массивов слиянием - на дом



    }
}
