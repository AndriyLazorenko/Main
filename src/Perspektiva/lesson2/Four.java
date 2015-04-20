package Perspektiva.lesson2;

/**
 * Created by Master on 15-Jan-15.
 */
public class Four {
    int one;
    int two;
    int three;
    int four;
    public void minmax (){
        int max = (one>two)?one:two;
        max = (max>three)?max:three;
        max = (max>four)?max:four;
        int min = (one<two)?one:two;
        min = (min<three)?min:three;
        min = (min<four)?min:four;
        System.out.printf("Maximal value is %d; Minimal value is %d",max,min);
}}
