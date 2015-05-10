package ArtCode.hometask4.Scanner;

/**
 * Created by Master on 09-May-15.
 */
public class VariousTests {
    public static void main(String[] args) {
        String [] arr = new String[4];
        arr[0] = "dsfasdf";
        arr[1] = "123";
        arr[2] = "aseda";
        arr[3] = "111";
        try {
            for (int i = 0; i<arr.length;i++)
                System.out.println(Integer.parseInt(arr[i]));
        } catch(NumberFormatException e) {
        }

    }

}
