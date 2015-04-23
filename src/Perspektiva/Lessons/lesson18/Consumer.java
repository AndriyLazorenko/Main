package Perspektiva.Lessons.lesson18;

/**
 * Created by Master on 24-Mar-15.
 */
public class Consumer extends Thread{
    int product = 0;
    public Consumer (Holder h){
        if (h.getPlaceToHold()==0){
            product = h.getPlaceToHold();
        }
        else {
            product = 0;
        }
    }
    public void run (){
        System.out.println(product);
    }
}
