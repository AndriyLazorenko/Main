package Perspektiva.Hometaks.hometask4;

/**
 * Created by Master on 26-Feb-15.
 */
public class Ababa {
    public static void main(String[] args) {
        String a = "Ababalamaga";
        String b = "a";
        String c = "A";
        int d = a.length();
        a = a.replaceAll(c,"");
        a = a.replaceAll(b,"");
        int e = d - a.length();
        System.out.println("Количество вхождений буквы 'a' = "+e);
    }
}
