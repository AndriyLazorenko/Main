package Perspektiva.hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 18-Jan-15.
 */
public class Palstring {
    public void method () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert your palindrome here");
        int pal = Integer.parseInt(br.readLine());
        //Finding length
        String pals = Integer.toString(pal);
        int num = pals.length();
        //Making a massive
        int [] palm = new int[num];
        for (int i = 0;i<num;i++){
             palm [i]= pals.charAt(i);
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
