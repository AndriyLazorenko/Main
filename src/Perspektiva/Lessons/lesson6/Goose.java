package Perspektiva.Lessons.lesson6;

/**
 * Created by Master on 29-Jan-15.
 */
public class Goose {
    public Goose (String a){
        this.name = a;
    }
    private String name;
    private boolean angry = true;
    public String getName(){
        return name;
    }
    public void setAngry (boolean b) {
        this.angry = b;
    }
    public void pat (Cat c){
        c.setAngry(false);
        System.out.println("Кот "+c.getName()+" доволен =)");
    }
}
