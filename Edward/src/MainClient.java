import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Master on 01-May-15.
 */
public class MainClient {
    public static void main(String[] args) {
        System.out.println("Waiting for server");
        try {
            Socket s = new Socket();    //клиентская конструкция
            s.connect(new InetSocketAddress("localhost",8189),10000);
            InputStream inputStream = s.getInputStream();//входящая труба
            Scanner in = new Scanner(inputStream);//адаптер на входящую трубу
            OutputStream outputStream = s.getOutputStream();//исходящая труба
            PrintWriter out = new PrintWriter(outputStream,true);
            while (in.hasNextLine())
                System.out.println(in.nextLine());
            out.println("Client has connected");
            System.out.println("Check");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
