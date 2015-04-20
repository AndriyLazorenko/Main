package Perspektiva.lessonExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 18-Mar-15.
 */
public class Except {
    public static void main(String[] args) {
        System.out.println("Insert a number");
        /*try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
                String st = null;
                try {
                    st = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    int i = Integer.parseInt(st);
                    System.out.println(i);
                } catch (NumberFormatException e) {
                    System.out.println("Please insert a NUMBER, MOTHERFUCKER!!!");
                    System.out.println("Type 'Exit' to escape");
                }
                finally {
                    if (st.equals("exit")||st.equals("Exit")){
                        break;
                    }
                }
            }
    }
}
