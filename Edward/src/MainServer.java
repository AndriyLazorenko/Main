import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Master on 01-May-15.
 */
public class MainServer {
    public static void main(String[] args) {

        //Creating a new socket on server side

        try {
            ServerSocket serverSocket = new ServerSocket(8189);//Серверная конструкция
            System.out.println("Waiting for client");
            Socket incoming = serverSocket.accept();//принимаем клиента
            InputStream inputStream = incoming.getInputStream();//входящая труба
            OutputStream outputStream = incoming.getOutputStream();//исходящая труба
            Scanner in = new Scanner(inputStream);//обработка входящей трубы
            PrintWriter out = new PrintWriter(outputStream,true);//обработка данных для выходящей трубы с автосливом
            out.println("Hello! Enter BYE to exit.");
            boolean done = false;
            while(!done&&in.hasNextLine()){
                String line = in.nextLine();
                out.println("Echo: "+line);
                if (line.trim().equals("BYE")) done=true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
