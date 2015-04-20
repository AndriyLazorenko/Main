package Perspektiva.lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Master on 12-Mar-15.
 */
public class Client {
    public static void main(String[] args) {
        //Декларации
        Socket s = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        BufferedReader console = null;
        //Connection
        try {
            s = new Socket("localhost",65123);
            System.out.println("Waiting for server");
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            pw = new PrintWriter(s.getOutputStream());
            console = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Приветствие от сервера: " + br.readLine());
            while (s.isConnected()){
                //writing
                String temp = null;
                temp = console.readLine();
                pw.println("temp");
                pw.flush();
                //reading
                String str = null;
                str=br.readLine();
                if (str.equals("exit")){
                    pw.println("exit");
                    pw.flush();
                    System.out.println("Cerf? ,kzlm? услышь Дамбасс!");
                }
                System.out.println("От сервера: " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
