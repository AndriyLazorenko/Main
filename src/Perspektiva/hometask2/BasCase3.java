package Perspektiva.hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 17-Jan-15.
 */
public class BasCase3 {
    public void method() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Team 1");
        String T1 = br.readLine();
        System.out.println("Team 2");
        String T2 = br.readLine();
        System.out.println("Score time 1");
        String s1t1 = br.readLine();
        System.out.println("Score time 2");
        String s1t2 = br.readLine();
        System.out.println("Score time 3");
        String s1t3 = br.readLine();

        //Score correctness check

        if (s1t1.length()>=3 & s1t1.length()<6 & s1t2.length()>=3 & s1t2.length()<6 & s1t3.length()>=3 & s1t3.length()<6) {

            //Checkforspace cycle - looking for a divisor in a String of score

            //Checkfospace for the first time

            int checkforspacet1 = 0;
            for (int i=0; i<s1t1.length();i++) {
                if (Character.isDigit(s1t1.charAt(i))){
                }
                else checkforspacet1=i;
            }

            //Checkforspace for the second time

            int checkforspacet2 = 0;
            for (int i=0; i<s1t2.length();i++) {
                if (Character.isDigit(s1t2.charAt(i))){
                }
                else checkforspacet2=i;
            }
            //Checkforspace for the third time

            int checkforspacet3 = 0;
            for (int i=0; i<s1t3.length();i++) {
                if (Character.isDigit(s1t3.charAt(i))) {
                } else checkforspacet3 = i;
            }

            //Making a first integer out of String score

            //Time 1

            int [] i1t1 = new int [checkforspacet1];
            for (int i=0; i<checkforspacet1;i++) {
                i1t1[i] = Integer.parseInt(String.valueOf(s1t1.charAt(i)));
            }
            int sc11 = 0;
            int base = 10;
            for (int i = 0; i < checkforspacet1; i++)
                sc11 = sc11 * base + i1t1[i];

            //Time 2

            int [] i1t2 = new int [checkforspacet2];
            for (int i=0; i<checkforspacet2;i++) {
                i1t2[i] = Integer.parseInt(String.valueOf(s1t2.charAt(i)));
            }
            int sc12 = 0;
            for (int i = 0; i < checkforspacet2; i++)
                sc12 = sc12 * base + i1t2[i];

            //Time 3

            int [] i1t3 = new int [checkforspacet3];
            for (int i=0; i<checkforspacet3;i++) {
                i1t3[i] = Integer.parseInt(String.valueOf(s1t3.charAt(i)));
            }
            int sc13 = 0;
            for (int i = 0; i < checkforspacet3; i++)
                sc13 = sc13 * base + i1t3[i];

            //Making a second integer out of String score

            //Time 1

            int [] i2t1 = new int [s1t1.length()-checkforspacet1-1];
            for (int i=0; i<s1t1.length()-checkforspacet1-1;i++) {
                i2t1[i] = Integer.parseInt(String.valueOf(s1t1.charAt(i+checkforspacet1+1)));
            }
            int sc21 = 0;
            for (int i = 0; i < s1t1.length()-checkforspacet1-1; i++)
                sc21 = sc21 * base + i2t1[i];

            //Time 2

            int [] i2t2 = new int [s1t2.length()-checkforspacet2-1];
            for (int i=0; i<s1t2.length()-checkforspacet2-1;i++) {
                i2t2[i] = Integer.parseInt(String.valueOf(s1t2.charAt(i+checkforspacet2+1)));
            }
            int sc22 = 0;
            for (int i = 0; i < s1t2.length()-checkforspacet2-1; i++)
                sc22 = sc22 * base + i2t2[i];

            //Time 3

            int [] i2t3 = new int [s1t3.length()-checkforspacet3-1];
            for (int i=0; i<s1t3.length()-checkforspacet3-1;i++) {
                i2t3[i] = Integer.parseInt(String.valueOf(s1t3.charAt(i+checkforspacet3+1)));
            }
            int sc23 = 0;
            for (int i = 0; i < s1t3.length()-checkforspacet3-1; i++)
                sc23 = sc23 * base + i2t3[i];

            //Processed score outputs

            System.out.println("Final Score is "+(sc11+sc12+sc13)+":"+(sc21+sc22+sc23));
            if ((sc11+sc12+sc13)>(sc21+sc22+sc23)){
                System.out.printf("Team %s has won", T1);
            }
            else System.out.printf("Team %s has won",T2);

            //end of case 3

        }
        else {
            System.out.println("Motherfucker!!! I've warned you!");
        }
    }
}
