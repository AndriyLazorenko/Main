package Perspektiva.Hometaks.hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 18-Jan-15.
 */
public class Palmas {
    public void method() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert your palindrome here");
        int pal = Integer.parseInt(br.readLine());
        // Counting number of digits
        int num = 0;
        int palforwhile = pal;
        while (palforwhile != 0){
            palforwhile = palforwhile/10;
            num++;
        }
        //Making a massive take 1
        /*int [] palm = new int[num];
        while (pal!=0){
            int i=0;
            palm [i]= pal%(10);
            pal=pal/10;
            System.out.println(palm[i]);
            i++;
        }*/
        //Making a massive take 2
        int [] palm = new int[num];
        for (int i=0;i<num;i++) {
            palm[i] = pal % (10);
            pal = pal / 10;
        }
        //Palindrome check
        int check = 0;
        if (num%2==0){
            for (int i = 0; i<num/2; i++){
                if (palm[i]!=palm[num-1-i]) {
                    System.out.println("This is not a palindrome");
                    break;
                }
                else {
                    check++;
                }
            }
            if (check == num/2)
                System.out.println("That's a palindrome!");
        }
        else {
            for (int i = 0; i<num/2-1;i++) {
                if (palm[i]!=palm[num-1-i]) {
                    System.out.println("This is not a palindrome");
                    break;
                }
                else {
                    check++;
                }
                if (check == num/2-1)
                    System.out.println("That's a palindrome!");

            }
        }
    }
}
