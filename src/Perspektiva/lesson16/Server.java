package Perspektiva.lesson16;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Master on 12-Mar-15.
 */
public class Server {
    public static void main(String[] args) {
        //Декларации
        ServerSocket ss = null;
        Socket s = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        BufferedReader console = null;
        //Connection
        try {
            ss = new ServerSocket(65123);
            System.out.println("Waiting for client");
            s=ss.accept();
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            pw = new PrintWriter(s.getOutputStream());
            console = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Приветствие от клиента: " + br.readLine());

            while (s.isConnected()){
                //reading
                String str = br.readLine();
                if (str.equals("exit")){
                    pw.println("exit");
                    pw.flush();
                    System.out.println("Донбасс не забудет, Донбасс не простит!");
                }
                System.out.println("От клиента: " + str);
                //writing
                String temp = console.readLine();
                pw.println("temp");
                pw.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //InputStream is = s.getInputStream();
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Синхронное общение. Отправка - прием, обратно - прием, отправка.
    }
}
