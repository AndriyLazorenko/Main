package Perspektiva.lessonOOP;

/**
 * Created by Master on 25-Mar-15.
 */
public class Megafight {
    Marriage mar1;
    Marriage mar2;
    Marriage mar3;
    Marriage mar4;
    public Megafight (Marriage m1, Marriage m2, Marriage m3, Marriage m4){
        this.mar1 = m1;
        this.mar2 = m2;
        this.mar3=m3;
        this.mar4=m4;
    }
    public void fight (){
        System.out.println("MEGAfight has begun!!!");
        //Fight as a free for all
        while (mar1.saveTheWinner().getHealth()>0||mar2.saveTheWinner().getHealth()>0||mar3.saveTheWinner().getHealth()>0||mar4.saveTheWinner().getHealth()>0) {
            //Health declaration
            System.out.println(mar1.saveTheWinner().getFio() + " has " + mar1.saveTheWinner().getHealth() + " health");
            System.out.println(mar2.saveTheWinner().getFio() + " has " + mar2.saveTheWinner().getHealth() + " health");
            System.out.println(mar3.saveTheWinner().getFio() + " has " + mar3.saveTheWinner().getHealth() + " health");
            System.out.println(mar4.saveTheWinner().getFio() + " has " + mar4.saveTheWinner().getHealth() + " health");
            //Punch logic
            int punch1 = (int) (Math.random() * 20);
            int punch2 = (int) (Math.random() * 15);
            int punch3 = (int) (Math.random() * 25);
            int punch4 = (int) (Math.random() * 10);
            //Choosing a guy to punch

            /*human1.setHealth(human1.getHealth() - punch1);
            human2.setHealth(human1.getHealth() - punch2);
        }
        if (human1.getHealth()>human2.getHealth()){
            System.out.println(human1.getFio()+" has won!!!");
            human1.setHealth(100);
            human2.setHealth(100);
            setFirstHasWon(true);
        }
        else {
            System.out.println(human2.getFio()+" has won!!!");
            human1.setHealth(100);
            human2.setHealth(100);
            setFirstHasWon(false);
        }*/
        }
    }
}
