package Perspektiva.Lessons.lesson3;

/**
 * Created by Master on 20-Jan-15.
 */
public class TwoMas {
    int [][] array = new int [5][5];
    public void one (){
        for (int i = 0; i<5;i++) {
            for (int j=0; j<5;j++){
                array [i][j]=(int) ((Math.random()-1.5)*100);
                if (j!=4)
                System.out.print(array[i][j]+" ");
                    else {
                    System.out.println(array[i][j]+" ");
                }
            }
        }
    }
    public void two (){
        int [] a = new int [5];
        for (int j=0; j<5;j++){
            a [j] = (int) ((Math.random()-1)*100);
            System.out.println(a[j]);
        }
    }
    public void three () {
        //Creating massive
        int [] a = new int [6];
        for (int j=0; j<5;j++){
            a [j] = (int) ((Math.random()-1)*100);
            System.out.println(a[j]);
        }
        //Puzyrok
        for (int j =0;j<5;j++) {
            for (int i = 0; i < 5; i++) {
                if (a[i] > a[i + 1]) {
                    a[i + 1] = a[i] + a[i + 1];
                    a[i] = a[i + 1] - a[i];
                    a[i + 1] = a[i + 1] - a[i];
                }
            }
            if (j==4){
                for (int i=0;i<5;i++)
                System.out.print(a[i]+" ");
            }
        }
    }
}
