package Perspektiva.hometask1;

/**
 * Created by Master on 14-Jan-15.
 */
public class Human {
    String name;
    String surname;
    String father;
    public void eat() {
        System.out.printf("%s %s %s has eaten\n",surname,name,father);
    }
    public void sleep(){
        System.out.printf("%s %s %s has slept\n",surname,name,father);
    }
    public void work(){
        System.out.printf("%s %s %s has worked\n",surname,name,father);
    }
    public void sex(){
        System.out.printf("%s %s %s has had sex on 15th of January\n",surname,name,father);
    }
}
