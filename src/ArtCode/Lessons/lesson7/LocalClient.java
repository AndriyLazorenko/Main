package ArtCode.Lessons.lesson7;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Master on 11-May-15.
 */
public class LocalClient {
    public static void main(String[] args) throws IOException {
        final Socket s = new Socket();
        s.connect(new InetSocketAddress("localhost",10010),10000);

        System.out.println("Waiting for server");
        System.out.println(s.isConnected());

        //Client write message

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    PrintWriter pw = new PrintWriter(s.getOutputStream());
                    Scanner console = new Scanner(System.in);
                    while (true){
                        String message = console.nextLine();
                        pw.println(message);
                        pw.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        //Client read message

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    InputStream is = s.getInputStream();
                    InputStreamReader adapter = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(adapter);
                    String remoteMessage = br.readLine();
                    while (remoteMessage!=null){
                        System.out.println(remoteMessage);
                        remoteMessage = br.readLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

}
//          OLD CLIENT
//        Socket s = new Socket();
//        s.connect(new InetSocketAddress("localhost",10010),10000);
//        System.out.println("Waiting for server");
//        System.out.println(s.isConnected());
//        InputStream is = s.getInputStream();
//        OutputStream os = s.getOutputStream();
//        InputStreamReader adapter = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(adapter);
//        String remoteMessage = br.readLine();
//        while (remoteMessage!=null){
//            System.out.println(remoteMessage);
//            remoteMessage = br.readLine();
//        }
//        System.out.println(remoteMessage);
//        String localMessage = "Hello, Serhiy! My name is Andriy";
//        PrintWriter pw = new PrintWriter(os);
//        System.out.println(localMessage);
//        pw.println();
//        pw.flush();
