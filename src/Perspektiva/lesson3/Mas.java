package Perspektiva.lesson3;

/**
 * Created by Master on 20-Jan-15.
 */
public class Mas {
    int [] basic = new int [3001];
    public void one () {
        for (int i=0; i<3001;i++){
            basic[i]=i;
        }
        for (int i:basic){
            if (basic[i]%8==0)
                System.out.println(basic[i]);
        }
    }
    public void two (){
        // FINISH AS A HOMEWORK!!!

    }
}
