package Perspektiva.lesson4;

/**
 * Created by Master on 22-Jan-15.
 */
public class Armcheck {
    public int check(String a){
        char [] c = a.toCharArray();
        int old = Integer.parseInt(a);
        int [] in = new int[a.length()];
        int ctrl=0;
        for (int i=0;i<a.length();i++) {
            //Костыль перегона чара в стринг
            in[i]=Integer.parseInt(""+c[i]);
            //System.out.println(in[i]);
        }
        for (int i=0;i<a.length();i++) {
            ctrl =ctrl + (int) (Math.pow(in[i],a.length()));
            //System.out.println(ctrl);
        }
        //System.out.println(ctrl+" "+old);
        if (Integer.compare(ctrl,old)==0) {
            System.out.printf("Yes, %d is an Armstrong number\n", old);
            return old;
        }
        else {
            System.out.println("No! It's not that number, beatch! I'll rape you!");
            return 0;
        }
    }
}
