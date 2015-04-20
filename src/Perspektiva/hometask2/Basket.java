package Perspektiva.hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 16-Jan-15.
 */
public class Basket {
    public void win () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("№ of times");
        int num = Integer.parseInt(br.readLine());
        switch (num) {

            // Кейсы проработаны в зависимости от количества таймов, задаваемого пользователем

            case 1 :
                System.out.println("Team 1");
                String T1 = br.readLine();
                System.out.println("Team 2");
                String T2 = br.readLine();
                System.out.println("Score time 1");
                String s1t1 = br.readLine();

                //User invalid check

                if (s1t1.length()<=5 & s1t1.length()>=3){

                    //Checkforspace cycle - looking for a divisor in a String of score

                    int checkforspace = 0;
                    for (int i = 0; i < s1t1.length(); i++) {
                        if (Character.isDigit(s1t1.charAt(i))) {
                        } else checkforspace = i;
                    }

                    //Making a first integer out of String score

                    int[] i1t1 = new int[checkforspace];
                    for (int i = 0; i < checkforspace; i++) {
                        i1t1[i] = Integer.parseInt(String.valueOf(s1t1.charAt(i)));
                    }
                    int sc1 = 0, base = 10;
                    for (int i = 0; i < checkforspace; i++)
                        sc1 = sc1 * base + i1t1[i];

                    //Making a second integer out of String score

                    int[] i1t2 = new int[s1t1.length() - checkforspace - 1];
                    for (int i = 0; i < s1t1.length() - checkforspace - 1; i++) {
                        i1t2[i] = Integer.parseInt(String.valueOf(s1t1.charAt(i + checkforspace + 1)));
                    }
                    int sc2 = 0;
                    for (int i = 0; i < s1t1.length() - checkforspace - 1; i++)
                        sc2 = sc2 * base + i1t2[i];

                    //Processed score outputs

                    System.out.println("Final Score is "+sc1+":"+sc2);
                    if (sc1>sc2){
                        System.out.printf("Team %s has won", T1);
                    }
                    else System.out.printf("Team %s has won", T2);

                    break;
                }

                else {
                    System.out.println("Motherfucker! You break my code I break your neck!");
                    break;
                }
            //end of case 1

            case 2 :

                System.out.println("Team 1");
                T1 = br.readLine();
                System.out.println("Team 2");
                T2 = br.readLine();
                System.out.println("Score time 1");
                s1t1 = br.readLine();
                System.out.println("Score time 2");
                String s1t2 = br.readLine();

                //Score correctness check

                if (s1t1.length()>=3 & s1t1.length()<6 & s1t2.length()>=3 & s1t2.length()<6) {

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
                    //Making a first integer out of String score

                    //Time 1

                    int [] c2i1t1 = new int [checkforspacet1];
                    for (int i=0; i<checkforspacet1;i++) {
                        c2i1t1[i] = Integer.parseInt(String.valueOf(s1t1.charAt(i)));
                    }
                    int sc11 = 0;
                    int base = 10;
                    for (int i = 0; i < checkforspacet1; i++)
                        sc11 = sc11 * base + c2i1t1[i];

                    //Time 2

                    int [] c2i1t2 = new int [checkforspacet2];
                    for (int i=0; i<checkforspacet2;i++) {
                        c2i1t2[i] = Integer.parseInt(String.valueOf(s1t2.charAt(i)));
                    }
                    int sc12 = 0;
                    for (int i = 0; i < checkforspacet2; i++)
                        sc12 = sc12 * base + c2i1t2[i];

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

                    //Processed score outputs

                    System.out.println("Final Score is "+(sc11+sc12)+":"+(sc21+sc22));
                    if ((sc11+sc12)>(sc21+sc22)){
                        System.out.printf("Team %s has won", T1);
                    }
                    else System.out.printf("Team %s has won",T2);
                    break;

                    //end of case 2

                }
                else {
                    System.out.println("Motherfucker!!! I've warned you!");
                    break;
                }


            case 3 :
                BasCase3 b3=new BasCase3();
                b3.method();
                break;
            case 4 :
                BasCase4 b4=new BasCase4();
                b4.method();
                break;
            default:
                System.out.println("Invalid user. Restart the program");
                break;
        }

    }
}
