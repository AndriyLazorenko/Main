package Perspektiva.Lessons.lessonExceptions;

/**
 * Created by Master on 18-Mar-15.
 */
public class OwnEx {
    public static void one() {
        two();
    }
    public static void two(){
        three();
    }
    public static void three (){
        four();
    }
    public static void four (){
        five ();
    }
    public static void five (){
        try {
            throw new KnownException("Motherfucker!!!");
        } catch (KnownException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            one ();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
