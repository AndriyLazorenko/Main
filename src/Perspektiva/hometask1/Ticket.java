package Perspektiva.hometask1;

/**
 * Created by Master on 14-Jan-15.
 */
public class Ticket {
    String from;
    String to;
    String timefrom;
    String timeto;
    float price;
    public void printit (){
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print("From");
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print(from);
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print("To");
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print(to);
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print("\n");

        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print("Time of departure");
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print(timefrom);
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print("Time of arrival");
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print(timeto);
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print("\n");

        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print("Price of the ticket is");
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print(price);
        for (int i=0;i<9;i+=1)
            System.out.print("**");
        System.out.print("\n");

        System.out.println("Можно было и красивее, но это - бета-версия :D");
    }
}
