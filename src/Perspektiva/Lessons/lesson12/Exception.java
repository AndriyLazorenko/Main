package Perspektiva.Lessons.lesson12;

/**
 * Created by Master on 26-Feb-15.
 */
public class Exception {
    public static void main(String[] args) {
        int i = 0;
        try {
            i = i/0;
        }
        catch (java.lang.Exception e) {
            System.out.println("Вот мудак!");
        }
    }
}
