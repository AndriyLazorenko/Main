package Perspektiva.Hometaks.hometask1;

/**
 * Created by Master on 14-Jan-15.
 */
public class Change {
    String one;
    String two;
    public void eXch (){
        String three = two;
        two = one;
        one = three;
        System.out.printf("%s %s",one,two);
        /*a=5, b=8
        * a=a+b
        * b=a-b
        * a=a-b
        * */

    }
}
