package Perspektiva.lesson2;

/**
 * Created by Master on 15-Jan-15.
 */
public class Eight {
    int one;
    int two;
    int three;
    int four;
    int five;
    int six;
    int seven;
    int eight;
    public void minmax (){
        int max = (one>two)?one:two;
        max = (max>three)?max:three;
        max = (max>four)?max:four;
        max = (max>five)?max:five;
        max = (max>six)?max:six;
        max = (max>seven)?max:seven;
        max = (max>eight)?max:eight;
        int min = (one<two)?one:two;
        min = (min<three)?min:three;
        min = (min<four)?min:four;
        min = (min<five)?min:five;
        min = (min<six)?min:six;
        min = (min<seven)?min:seven;
        min = (min<eight)?min:eight;
        System.out.printf("Maximal value is %d; Minimal value is %d",max,min);
}}
