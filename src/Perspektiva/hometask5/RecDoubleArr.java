package Perspektiva.hometask5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 27-Feb-15.
 */
public class RecDoubleArr {
    int size;
    int [][] doubleArray;
    public void setSize () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gimme number of elements, you!!!");
        size = Integer.parseInt(br.readLine());
    }
    public void setDoubleArray(){
        doubleArray = new int[size][size];
    }
    public void createArray (int i, int j){
        if (i!=doubleArray.length) {
            if (j!=doubleArray.length){
                doubleArray[i][j] = (int) (Math.random() * 100);
                createArray(i, j + 1);
                return;
            }
            createArray(i+1,j-doubleArray.length);
            return;
        }
    }
}
