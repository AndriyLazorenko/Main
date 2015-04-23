package Perspektiva.Lessons.lesson19;

/**
 * Created by Master on 26-Mar-15.
 */
public class Potock extends Thread{
    final Printer printer;
    private int count=0;

    public Potock(Printer printer, String name){
        this.printer = printer;
        setName(name);
    }
    @Override
    public void run (){
        while (!isInterrupted()){
            try {
                printer.print(getName()+" "+count++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
