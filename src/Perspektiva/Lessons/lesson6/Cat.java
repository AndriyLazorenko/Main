package Perspektiva.Lessons.lesson6;

/**
 * Created by Master on 29-Jan-15.
 */
public class Cat {
    public Cat (String a) {
        this.name = a;
    }
    private String name;
    private boolean angry = true;
    public String getName(){
        return name;
    }
    public void setAngry (boolean b){
        this.angry=b;
    }
    public void pat (Goose g){
        g.setAngry(false);
        System.out.println("Гусь "+g.getName()+" доволен =)");
    }
}
