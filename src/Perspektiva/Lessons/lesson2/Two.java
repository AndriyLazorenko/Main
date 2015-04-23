package Perspektiva.Lessons.lesson2;

/**
 * Created by Master on 15-Jan-15.
 */
public class Two {
    int one;
    int two;
    public void minmax (){
        int max = (one>two)?one:two;
        int min = (one<two)?one:two;
        System.out.printf("Maximal value is %d; Minimal value is %d",max,min);
    }
}
