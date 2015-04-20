package Perspektiva.lesson18;

/**
 * Created by Master on 24-Mar-15.
 */
public class Producer extends Thread {
    boolean bool = false;
    public Producer (Holder h){
        if(h.getPlaceToHold()==0){
            h.setPlaceToHold((int)(Math.random()*100));
            bool = true;
        }
        else bool = false;
    }
    public void run(){
        System.out.println(bool);
    }
}
