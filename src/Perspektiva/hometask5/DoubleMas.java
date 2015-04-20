package Perspektiva.hometask5;

/**
 * Created by Master on 28-Feb-15.
 */
public class DoubleMas {
    int size = 10;
    int [][] arr = new int[size][size];
    public void create (){
        for (int i=0; i<arr.length;i++){
            for (int j = 0; j<arr.length;j++){
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
    }
    public void out (){
        for (int i=0; i<arr.length;i++){
            for (int j = 0; j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
