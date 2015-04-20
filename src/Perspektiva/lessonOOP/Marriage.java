package Perspektiva.lessonOOP;

/**
 * Created by Master on 25-Mar-15.
 */
public class Marriage {
    private Human human1;
    private Human human2;
    private boolean firstHasWon;
    public Marriage (Human h1, Human h2){
        this.setHuman1(h1);
        this.setHuman2(h2);
    }
    public Human saveTheWinner (){
        if (isFirstHasWon()) return this.human1;
        else return this.human2;
    }
    public void fight (){
        System.out.println("The relations have deteriorated and the fight has begun!!!");
        while (getHuman1().getHealth()>0&& getHuman2().getHealth()>0) {
                System.out.println(getHuman1().getFio() + " has " + getHuman1().getHealth() + " health");
                System.out.println(getHuman2().getFio() + " has " + getHuman2().getHealth() + " health");
                int punch1 = (int) (Math.random() * 20);
                int punch2 = (int) (Math.random() * 15);
                getHuman1().setHealth(getHuman1().getHealth() - punch1);
                getHuman2().setHealth(getHuman1().getHealth() - punch2);
        }
        if (getHuman1().getHealth()> getHuman2().getHealth()){
            System.out.println(getHuman1().getFio()+" has won!!!");
            getHuman1().setHealth(100);
            getHuman2().setHealth(100);
            setFirstHasWon(true);
        }
        else {
            System.out.println(getHuman2().getFio()+" has won!!!");
            getHuman1().setHealth(100);
            getHuman2().setHealth(100);
            setFirstHasWon(false);
        }
    }

    public boolean isFirstHasWon() {
        return firstHasWon;
    }

    public void setFirstHasWon(boolean firstHasWon) {
        this.firstHasWon = firstHasWon;
    }

    public Human getHuman1() {
        return human1;
    }

    public void setHuman1(Human human1) {
        this.human1 = human1;
    }

    public Human getHuman2() {
        return human2;
    }

    public void setHuman2(Human human2) {
        this.human2 = human2;
    }
}
