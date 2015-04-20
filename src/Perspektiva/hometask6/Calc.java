package Perspektiva.hometask6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 07-Mar-15.
 */
public class Calc {
    public void mainmenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Make a choice");
        System.out.println("Do you wanna work with fractions? (Y/N)");
        String choiceFractions = br.readLine();
        System.out.println("Make a choice. Choose a desirable operation");
        System.out.printf("%20d%30s\n",1,"Addition of two numbers");
        System.out.printf("%20d%30s\n",2,"Substraction of two numbers");
        System.out.printf("%20d%30s\n",3,"Multiplication of two numbers");
        System.out.printf("%20d%30s\n",4,"Division of two numbers");
        int choiceOperation = Integer.parseInt(br.readLine());
        String conditiony = "y";
        String conditionY = "Y";
        if (choiceFractions.equals(conditiony)||choiceFractions.equals(conditionY)){
            Fraction f = new Fraction();
            int []first = new int[2];
            int []second = new int[2];
            System.out.println("Type first numerator");
            first[0] = Integer.parseInt(br.readLine());
            System.out.println("Type first denominator");
            first[1] = Integer.parseInt(br.readLine());
            System.out.println("Type second numerator");
            second[0] = Integer.parseInt(br.readLine());
            System.out.println("Type second denominator");
            second[1] = Integer.parseInt(br.readLine());
            switch (choiceOperation) {
                case 1:
                    System.out.println(f.print(f.addition(first, second)));
                    break;
                case 2:
                    System.out.println(f.print(f.substraction(first, second)));
                    break;
                case 3:
                    System.out.println(f.print(f.multiplication(first, second)));
                    break;
                case 4:
                    System.out.println(f.print(f.division(first, second)));
                    break;
            }
        }
        else {
            Number n = new Number();
            System.out.println("Insert first number");
            double first = Integer.parseInt(br.readLine());
            System.out.println("Insert second number");
            double second = Integer.parseInt(br.readLine());
            switch (choiceOperation) {
                case 1:
                    System.out.println(n.addition(first,second));
                    break;
                case 2:
                    System.out.println(n.substraction(first, second));
                    break;
                case 3:
                    System.out.println(n.multiplication(first,second));
                    break;
                case 4:
                    System.out.println(n.division(first,second));
                    break;
            }
        }
    }
}
