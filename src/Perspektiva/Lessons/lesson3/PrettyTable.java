package Perspektiva.Lessons.lesson3;

import java.util.List;

/**
 * Created by Master on 25-Feb-15.
 */
public class PrettyTable {
    public void pretty (List<Long> a) {
        char [] c = new char[115] ;
        for (int i = 0; i<c.length-1;i++){
            c[i]=(char)42;
        }
        String common = "%20s%20s%30s%20s%20s\n";
        String s = new String(c);
        System.out.printf(common, "Number of elements","*", "Blunt copy mechanism","*", "Arraycopy");
        System.out.printf(s+"\n");
        System.out.printf(common,"100","*",a.get(0),"*",a.get(1));
        System.out.printf(common,"1000","*",a.get(2),"*",a.get(3));
        System.out.printf(common,"10000","*",a.get(4),"*",a.get(5));
        System.out.printf(common,"100000","*",a.get(6),"*",a.get(7));
        //System.out.printf("%10d*%5d=%7d",10,10,10);
    }
}
