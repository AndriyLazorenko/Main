package Perspektiva.Hometaks.hometask6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 22-Mar-15.
 */
public class MainPhone {
    public static void main(String[] args) {
        Phone p = new Phone(100);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Позвонить - возвращает дату в формате String
        while (true) {
            System.out.println("Input a phone number in number format");
            try {
                String phoneNum = br.readLine();
                p.call(phoneNum);
                System.out.println("Print 'exit' to escape");
                String command = br.readLine();
                if (command.equals("exit")){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Отправить смс - возвращает смс
        while (true) {
            System.out.println("Input a phone number in number format");
            try {
                String phoneNum = br.readLine();
                p.sms(phoneNum);
                System.out.println("Print 'exit' to escape");
                String command = br.readLine();
                if (command.equals("exit")){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Пополнение телефонного номера
        while (true) {
            System.out.println("Input a phone number in number format");
            try {
                String phoneNum = br.readLine();
                p.topup(phoneNum);
                System.out.println("Print 'exit' to escape");
                String command = br.readLine();
                if (command.equals("exit")){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(p.getAccount());
    }
}
