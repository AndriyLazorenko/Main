package Perspektiva.hometask1;

/**
 * Created by Master on 14-Jan-15.
 */
public class Programmer {
    String name;
    int age;
    public void print () {
        System.out.printf("His age is %d and his name is %s \n",age,name);
    }
    public void receive() {
        int zp = 100*age;
        System.out.println("He receives "+zp+" dollars");
    }
}
