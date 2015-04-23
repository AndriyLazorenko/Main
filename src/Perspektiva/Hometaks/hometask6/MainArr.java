package Perspektiva.Hometaks.hometask6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 22-Mar-15.
 */
public class MainArr {
    public static void main(String[] args) {
        Array ar = new Array();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            //Ввести количество элементов
            System.out.println("Insert a number of elements in array");
            int numberOfElementsInArray = Integer.parseInt(br.readLine());
            //Автоматически создать массив, заполнив случайными числами
            ar.randomArrCreate(numberOfElementsInArray);
            //Getter of array
            int arr[] = ar.getArr();
            //Bad print
            for (int a:arr){
                System.out.print(a + " ");
            }
            System.out.println();
            //Минимальный элемент
            System.out.println(ar.min(arr));
            //Максимальный элемент
            System.out.println(ar.max(arr));
            //Good print
            ar.print(arr);
            //Part sort (golden), first half of an array
            ar.sortPartly(0,arr.length/2);
            //Good print of sorted array
            ar.print(arr);
            //Resize of array with fill of random numbers, second half of array, print
            ar.resize(arr.length*2);
            int arr2[] = ar.getArr();
            ar.print(arr2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
